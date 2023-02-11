package com.aincrad.bookservice.controller;

import com.aincrad.bookservice.model.Book;
import com.aincrad.bookservice.repository.BookRepository;
import com.aincrad.bookservice.response.Cambio;
import com.aincrad.bookservice.response.CambioProxyFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

@RestController
@RequestMapping("book-service")
public class BookController {

    @Autowired
    private Environment env;
    @Autowired
    private BookRepository repository;

    @Autowired
    private CambioProxyFeign cambioProxyFeign;
    //http://localhost:8000/book-service/1/BRL

    @GetMapping(value = "/{id}/{currency}")
    public Book findBook(
            @PathVariable("id") Long id,
            @PathVariable("currency") String currency
    ){

        var localPort = env.getProperty("local.server.port");
        Optional<Book> book = repository.findById(id);
        if (book.isEmpty()) throw new RuntimeException("Book not found");


        Cambio resProxy = cambioProxyFeign.getCambio(book.get().getPrice(),"USD",currency);

        book.get().setEnvironment("Porta do book-service chamado -> " + localPort + "Porta do cambio-service chamado -> "+resProxy.getEnvironment());

        book.get().setPrice(resProxy.getConvertedValue());
        book.get().setCurrency(currency);

        return book.get();
    }

}
