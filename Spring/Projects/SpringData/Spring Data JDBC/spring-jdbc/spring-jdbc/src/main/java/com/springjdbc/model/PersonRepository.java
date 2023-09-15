package com.springjdbc.model;


import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@EnableJdbcRepositories
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findByFirstName(String firstName);
    Person getPersonByLastName(String lastName);

    @Modifying
    @Query("UPDATE person_table SET first_name = :name WHERE id = :id")
    boolean updateByFirstName(@Param("id") Long id, @Param("name") String name);
}