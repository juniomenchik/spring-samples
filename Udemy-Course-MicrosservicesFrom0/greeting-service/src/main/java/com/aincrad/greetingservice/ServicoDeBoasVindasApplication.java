package com.aincrad.greetingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class  ServicoDeBoasVindasApplication {

	public static void main(String[] args) {
		var hostName = System.getenv("HOSTNAME");
		System.out.println("HOSTNAME: " + hostName);
		SpringApplication.run(ServicoDeBoasVindasApplication.class, args);
	}

}
