package com.springkafka.kafka;

import com.springkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {

    private static final Logger LOGGER = LoggerFactory.getLogger(JsonKafkaConsumer.class);

    @KafkaListener(topics = "javaguides_json-topic", groupId = "myGroup")
    public void consumeMessage(User data) {
        LOGGER.info("JsonKafkaConsumer::consumeMessage");
        LOGGER.info(String.format("Consumed message: %s", data.toString()));
    }

}
