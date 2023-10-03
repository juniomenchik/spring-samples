package com.treinoredis.http.controller;

import com.treinoredis.entity.ClientRedis;
import com.treinoredis.service.ClientRedisService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v2/clientRedis")
public class ClientRedisControllerV2 {
    @Autowired
    private ClientRedisService service;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientRedis save(@RequestBody ClientRedis clientRedis) {
        return service.save(clientRedis);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ClientRedis> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ClientRedis findById(@PathVariable("id") Long id) {
        return service.findById(id).orElseThrow(() -> new RuntimeException("ClientRedis not found"));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void removeById(@PathVariable("id") Long id) {
        service.removeById(id);
    }

    @PutMapping("/{id}")
    public void updateClientRedis(@PathVariable("id") Long id, @RequestBody ClientRedis clientRedis) {
        service.findById(id).map(clientRedisAtt -> {
            modelMapper.map(clientRedis, clientRedisAtt);
            return service.save(clientRedisAtt);
        }).orElseThrow(() -> new RuntimeException("ClientRedis not found"));
    }
}
