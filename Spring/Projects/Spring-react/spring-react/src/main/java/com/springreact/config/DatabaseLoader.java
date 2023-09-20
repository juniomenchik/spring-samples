package com.springreact.config;

import com.springreact.model.Empregado;
import com.springreact.model.EmpregadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {
    private final EmpregadoRepository repository;

    @Autowired
    public DatabaseLoader(EmpregadoRepository repository) {
        this.repository = repository;
    }
    @Override
    public void run(String... args) throws Exception {
        this.repository.save(new Empregado("Frodo", "Baggins", "ring bearer"));
    }
}
