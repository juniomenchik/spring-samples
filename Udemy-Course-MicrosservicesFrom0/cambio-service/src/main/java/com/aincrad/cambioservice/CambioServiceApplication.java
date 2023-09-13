package com.aincrad.cambioservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CambioServiceApplication {

	public static void main(String[] args) {
		var hostName = System.getenv("HOSTNAME");
		System.out.println("HOSTNAME: " + hostName);
		SpringApplication.run(CambioServiceApplication.class, args);
	}

}
