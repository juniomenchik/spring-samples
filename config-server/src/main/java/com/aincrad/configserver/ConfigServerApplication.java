package com.aincrad.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

	public static void main(String[] args) {
		var hostName = System.getenv("HOSTNAME");
		System.out.println("HOSTNAME: " + hostName);
		SpringApplication.run(ConfigServerApplication.class, args);
	}

}
