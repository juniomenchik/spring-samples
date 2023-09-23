package com.loginservice;

import com.loginservice.util.DatabaseSeeder;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginServiceApplication implements CommandLineRunner {

	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(LoginServiceApplication.class);
	@Autowired
	private DatabaseSeeder dbSeeder;

	public static void main(String[] args) {
		SpringApplication.run(LoginServiceApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		dbSeeder.insertData();
		LOGGER.info("Data inserted");
	}

}
