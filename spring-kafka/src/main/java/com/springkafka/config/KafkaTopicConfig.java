package com.springkafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {


    //KAFKA TOPIC CREATION
    @Bean
    public NewTopic javaguidesTopic() {
        return TopicBuilder.name("javaguides-topic")
                .build();
    }

    @Bean
    public NewTopic javaguidesJsonTopic() {
        return TopicBuilder.name("javaguides_json-topic")
                .build();
    }

}
