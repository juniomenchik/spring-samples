package br.com.springapp.example.model.exampleOnetoMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroMarcaService {

    @Autowired
    CarroRepository repository;

    @Autowired
    MarcaRepository repository2;


    public Carro save(Carro car) {
        return repository.save(car);
    }
}
