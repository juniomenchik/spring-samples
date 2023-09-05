package com.aincrad.bookservice.controller;

import java.util.Optional;

import com.aincrad.bookservice.model.Book;
import com.aincrad.bookservice.repository.BookRepository;
import com.aincrad.bookservice.response.Cambio;
import com.aincrad.bookservice.response.CambioProxyFeign;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
    Logger logger = LogManager.getLogger(BookController.class);

    @GetMapping(value = "/{id}/{currency}")
    public Book findBook(
            @PathVariable("id") Long id,
            @PathVariable("currency") String currency
    ){
        logger.info("BookController::findBook Iniciando Metodo...");
        logger.info("BookController::findBook request payload: id: "+id+" currency: "+currency);
        var localPort = env.getProperty("local.server.port");
        Optional<Book> book = repository.findById(id);
        if (book.isEmpty()) throw new RuntimeException("Book not found");


        Cambio resProxy = cambioProxyFeign.getCambio(book.get().getPrice(),"USD",currency);

        book.get().setEnvironment("book-service port: " + localPort + " cambio-service port: "+resProxy.getEnvironment());

        book.get().setPrice(resProxy.getConvertedValue());
        book.get().setCurrency(currency);

        logger.info("BookController::findBook response payload: "+ book.get());
        return book.get();
    }

}
