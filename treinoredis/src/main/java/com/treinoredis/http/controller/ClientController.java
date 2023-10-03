package com.treinoredis.http.controller;

import com.treinoredis.entity.Client;
import com.treinoredis.service.ClientService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {
    @Autowired
    private ClientService service;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client save(@RequestBody Client client) {
        return service.save(client);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Client> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Client findById(@PathVariable("id") Long id) {
        return service.findById(id).orElseThrow(() -> new RuntimeException("Client not found"));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeById(@PathVariable("id") Long id) {
        service.removeById(id);
    }

    @PutMapping("/{id}")
    public void updateClient(@PathVariable("id") Long id, @RequestBody Client client) {
        service.findById(id).map(clientAtt -> {
            modelMapper.map(client, clientAtt);
            return service.save(clientAtt);
        }).orElseThrow(() -> new RuntimeException("Client not found"));
    }
}
