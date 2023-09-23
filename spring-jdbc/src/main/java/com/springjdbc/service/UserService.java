package com.springjdbc.service;

import com.springjdbc.SpringJdbcApplication;
import com.springjdbc.jpa.UserRepository;
import com.springjdbc.model.User;
import com.springjdbc.validate.UserValidationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserValidationService userValidationService;

    public User createUser(User user) {
        try {
            if (userValidationService.validateUser(user)) {
                LOGGER.info("Creating user : {}",user.toString());
                return userRepository.save(user);
            } else {
                LOGGER.error("Error while creating user : {}",user.toString());
                throw new Exception("Error while creating user");
            }
        } catch (Exception e) {
            LOGGER.error("Error while creating user : {}",e.getMessage());
            return null;
        }
    }

    public User updateUser(User user) {
        try {
            if (userValidationService.validateUser(user)) {
                return userRepository.save(user);
            } else {
                LOGGER.error("Error while updating user : {}",user.toString());
                throw new Exception("Error while updating user");
            }
        } catch (Exception e) {
            LOGGER.error("Error while updating user : {}",e.getMessage());
            return null;
        }
    }

    public void deleteUser(Long id) {
        LOGGER.info("Deleting user with id : {}",id);
        userRepository.deleteById(id);
    }

    public User getUser(Long id) {
        LOGGER.info("Getting user with id : {}",id);
        return userRepository.findById(id).get();
    }

    public Iterable<User> getUsers() {
        LOGGER.info("Getting all users");
        return userRepository.findAll();
    }

}
