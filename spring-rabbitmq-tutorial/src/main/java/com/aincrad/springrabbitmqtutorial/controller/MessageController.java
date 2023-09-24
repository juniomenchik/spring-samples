package com.aincrad.springrabbitmqtutorial.controller;

import com.aincrad.springrabbitmqtutorial.publisher.RabbitMQProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MessageController.class);

    private RabbitMQProducer rabbitMQProducer;

    public MessageController(RabbitMQProducer rabbitMQProducer) {
        this.rabbitMQProducer = rabbitMQProducer;
    }

    @GetMapping("/message")
    public ResponseEntity<String> publishMessage(@RequestParam("message") String message) {
        LOGGER.info("MessageController::publishMessage - message: {}", message);
        rabbitMQProducer.sendMessage(message);
        return ResponseEntity.ok("Message sent to the RabbitMQ Successfully");
    }
}
