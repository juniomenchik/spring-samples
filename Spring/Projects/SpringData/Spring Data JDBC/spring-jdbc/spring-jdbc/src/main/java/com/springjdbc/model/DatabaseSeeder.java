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
        //criar um usuario
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS tb_user (id BIGINT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(75) NOT NULL, email VARCHAR(75) NOT NULL UNIQUE, password VARCHAR(100) NOT NULL)");
        jdbcTemplate.execute("INSERT INTO tb_user (name, email, password) VALUES ('Jeff Menchik', 'jeff@email.com','11112000')");
    }
}