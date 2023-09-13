package com.springjdbc.model;

import org.springframework.data.annotation.Id;

public class Person {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    // constructors, getters, setters
}