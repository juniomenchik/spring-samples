package com.treinoredis.service;

import com.treinoredis.entity.Client;
import com.treinoredis.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository repository;
    public Client save(Client client) {
        return repository.save(client);
    }
    public List<Client> findAll() {
        return repository.findAll();
    }
    public Optional<Client> findById(Long id){
        return repository.findById(id);
    }
    public void removeById(Long id) {
        repository.deleteById(id);
    }
}
