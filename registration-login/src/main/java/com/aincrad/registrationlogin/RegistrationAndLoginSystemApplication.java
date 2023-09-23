package com.aincrad.registrationlogin;

import com.aincrad.registrationlogin.util.DatabaseSeeder;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RegistrationAndLoginSystemApplication implements CommandLineRunner {
	private static final Logger LOGGER = org.slf4j.LoggerFactory.getLogger(RegistrationAndLoginSystemApplication.class);
	@Autowired
	private DatabaseSeeder dbSeeder;
	public static void main(String[] args) {
		SpringApplication.run(RegistrationAndLoginSystemApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		dbSeeder.insertData();
		LOGGER.info("Data inserted");
	}
}
