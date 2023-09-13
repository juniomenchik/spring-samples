package com.aincrad.bookservice.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.CircuitBreaker;
import org.springframework.retry.annotation.Recover;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("book-service")
public class FooBarController {

    private Logger logger = LoggerFactory.getLogger(FooBarController.class);

    @GetMapping("/foo-bar")
    //@Retryable(value = Exception.class)
    @CircuitBreaker(value = Exception.class)
    public String fooBar(){
        logger.info("Request to foo-bar is received!");
        var response = new RestTemplate().getForEntity("http://localhost:8080/foo-bar", String.class);
        return response.getBody();
    }

    @Recover
    public String chesquedele(Exception e){
        return "Chescou ne amigao ";
    }

}
