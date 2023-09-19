package com.springkube.useCases;

import com.springkube.SpringKubeApplication;
import com.springkube.common.Foo2;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.core.task.TaskExecutor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.kafka.support.converter.RecordMessageConverter;
import org.springframework.stereotype.Service;

@Service
public class kafkaTopic1Listener {
    private final Logger logger = LoggerFactory.getLogger(SpringKubeApplication.class);
    private final TaskExecutor exec = new SimpleAsyncTaskExecutor();
    @Bean
    public RecordMessageConverter converter() {
        return new JsonMessageConverter();
    }

//    @KafkaListener(id = "fooGroup", topics = "topic1")
//    public void listen(Foo2 foo) {
//        logger.info("Received: " + foo);
//        if (foo.getFoo().startsWith("fail")) {
//            throw new RuntimeException("failed");
//        }
//        this.exec.execute(() -> System.out.println("Hit Enter to terminate..."));
//    }

    @KafkaListener(id = "dltGroup", topics = "topic1.DLT")
    public void dltListen(byte[] in) {
        logger.info("Received from DLT: " + new String(in));
        this.exec.execute(() -> System.out.println("Hit Enter to terminate..."));
    }

    @Bean
    public NewTopic topic() {
        return new NewTopic("topic1", 1, (short) 1);
    }

    @Bean
    public NewTopic dlt() {
        return new NewTopic("topic1.DLT", 1, (short) 1);
    }

}
