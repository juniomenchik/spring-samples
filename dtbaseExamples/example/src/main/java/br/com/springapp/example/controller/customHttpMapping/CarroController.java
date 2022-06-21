package br.com.springapp.example.controller.customHttpMapping;

import br.com.springapp.example.model.exampleOnetoMany.Carro;
import br.com.springapp.example.model.exampleOnetoMany.CarroMarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro") // <---- dont't forget the requestMapping
public class CarroController {

    @Autowired
    CarroMarcaService repository;

    @PostMapping
    Carro postaCarro(@RequestBody Carro car){
        return repository.save(car);
    }

}
