package com.aincrad.registrationlogin.services;

import com.aincrad.registrationlogin.domain.Role;
import com.aincrad.registrationlogin.domain.User;
import com.aincrad.registrationlogin.domain.UserRegistrationDTO;
import com.aincrad.registrationlogin.domain.UserRepository;
import com.aincrad.registrationlogin.services.interfaces.IUserService;
import com.aincrad.registrationlogin.util.exceptions.BusinessException;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {


    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        super();
        this.userRepository = userRepository;
    }
    @Override
    public User save(UserRegistrationDTO registrationDTO) {
        User user = new User(registrationDTO.getFirstName(),
                registrationDTO.getLastName(),
                registrationDTO.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        getEmail(),
                registrationDTO.getPassword(),
                (new Role("ROLE_USER")));
    }
}
