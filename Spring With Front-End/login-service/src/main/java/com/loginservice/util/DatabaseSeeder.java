package com.loginservice.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseSeeder {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void insertData() {
        jdbcTemplate.execute("INSERT INTO role (name) VALUES ('ROLE_USER')");
    }
}