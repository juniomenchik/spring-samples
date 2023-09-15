package com.springjdbc.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.relational.core.mapping.NamingStrategy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void insertData() {


        jdbcTemplate.execute("DROP TABLE IF EXISTS person_table");
        jdbcTemplate.execute("CREATE TABLE person_table(id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");

        jdbcTemplate.execute("INSERT INTO person_table(first_name,last_name) VALUES('Victor', 'Hugo')");
        jdbcTemplate.execute("INSERT INTO person_table(first_name,last_name) VALUES('Dante', 'Alighieri')");
        jdbcTemplate.execute("INSERT INTO person_table(first_name,last_name) VALUES('Stefan', 'Zweig')");
        jdbcTemplate.execute("INSERT INTO person_table(first_name,last_name) VALUES('Oscar', 'Wilde')");
    }
}