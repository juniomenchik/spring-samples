package com.springkafka.controller;

import com.springkafka.kafka.JsonKafkaProducer;
import com.springkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kafka")
public class JsonMessageController {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonMessageController.class);

    private JsonKafkaProducer kafkaProducer;

    public JsonMessageController(JsonKafkaProducer producer) {
        this.kafkaProducer = producer;
        LOGGER.info("JsonMessageController");
    }

    @PostMapping("/publish")
    public ResponseEntity<String> publishMessage(@RequestBody User user) {
        LOGGER.info("JsonMessageController::publishMessage");
        kafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Message sent to Kafka Topic");
    }

}
