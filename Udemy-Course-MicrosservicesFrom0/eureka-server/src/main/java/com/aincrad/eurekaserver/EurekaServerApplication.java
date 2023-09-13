package com.aincrad.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApplication {

	public static void main(String[] args) {
		var hostName = System.getenv("HOSTNAME");
		System.out.println("HOSTNAME: " + hostName);
		SpringApplication.run(EurekaServerApplication.class, args);
	}

}
