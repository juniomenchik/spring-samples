package com.aincrad.bookservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BookServiceApplication {

	public static void main(String[] args) {
		var hostName = System.getenv("HOSTNAME");
		System.out.println("HOSTNAME: " + hostName);
		SpringApplication.run(BookServiceApplication.class, args);
	}

}
