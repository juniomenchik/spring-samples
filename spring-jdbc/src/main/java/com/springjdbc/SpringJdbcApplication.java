package com.springjdbc;

import com.springjdbc.model.DatabaseSeeder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJdbcApplication.class);
	@Autowired
	private DatabaseSeeder dbSeeder;
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		dbSeeder.insertData();
		LOGGER.info("Data inserted");
	}
}
