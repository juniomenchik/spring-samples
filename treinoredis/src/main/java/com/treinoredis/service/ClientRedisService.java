package com.treinoredis.service;

import com.treinoredis.entity.Client;
import com.treinoredis.entity.ClientRedis;
import com.treinoredis.repository.ClientRedisRepository;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Log4j2
@Service
@EnableScheduling
public class ClientRedisService {
    private final int MINUTO = 1000* 60;
    private final long MINUTOS = MINUTO * 1;
    @Autowired
    private ClientRedisRepository clientRedisRepository;
    @Autowired
    private ClientService clientService;
    @Autowired
    private ModelMapper modelMapper;

    public ClientRedis save(ClientRedis clientRedis) {
        return clientRedisRepository.save(clientRedis);
    }
    public List<ClientRedis> findAll() {
        return (List<ClientRedis>) clientRedisRepository.findAll();
    }
    public void removeById(Long id) {
        clientRedisRepository.deleteById(id);
    }
    public Optional<ClientRedis> findById(Long id) {
        return clientRedisRepository.findById(id);
    }

    @Scheduled(fixedDelay = MINUTOS)
    public void sincronyze() {
        List<ClientRedis> clientsRedis = findAll();
        if (clientsRedis.isEmpty()) {
            log.info("ClientRedisService::sincronyze - No clients to sincronyze");
            return;
        }
        log.info("ClientRedisService::sincronyze - Sincronyzing {} clients", clientsRedis.size());
        clientsRedis.forEach(clientRedis -> {
            log.info("ClientRedisService::sincronyze - Sincronyzing client {}", clientRedis.getId());
            clientService.save(modelMapper.map(clientRedis, Client.class));
            clientRedisRepository.deleteById(clientRedis.getId());
        });
    }
}
