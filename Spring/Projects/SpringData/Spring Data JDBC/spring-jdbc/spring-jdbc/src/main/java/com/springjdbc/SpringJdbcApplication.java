package com.springjdbc;

import com.springjdbc.model.DatabaseSeeder;

import com.springjdbc.model.Person;
import com.springjdbc.model.PersonRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class SpringJdbcApplication implements CommandLineRunner {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringJdbcApplication.class);
	@Autowired
	private PersonRepository repository;
	@Autowired
	private DatabaseSeeder dbSeeder;
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
	}
	@Override
	public void run(String... arg0) throws Exception {
		dbSeeder.insertData();
		LOGGER.info("All users -> {}", repository.findAll());
		LOGGER.info("User id 10001 -> {}", repository.findById(10001L));
		LOGGER.info("Inserting -> {}", repository.save(new Person("John", "Doe")));

		Person pers = repository.getPersonByLastName("Zweig");
		System.out.println(pers);
		LOGGER.info("All users -> {}", repository.findAll());
		repository.updateByFirstName(3L, "JeregJonson");
		LOGGER.info("All users -> {}", repository.findAll());
	}
}
