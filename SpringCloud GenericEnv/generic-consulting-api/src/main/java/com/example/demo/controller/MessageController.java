package com.example.demo.controller;

import com.example.demo.model.Task;
import com.example.demo.model.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message-service")
public class MessageController {

    @Autowired
    private Environment environment;

    @Autowired
    private TaskRepository  taskRepository;

    //http://localhost:8080/message-service/5
    @GetMapping("/{id}")
    public Task getMessage(){

        var varport = environment.getProperty("local.server.port");

    }
}
