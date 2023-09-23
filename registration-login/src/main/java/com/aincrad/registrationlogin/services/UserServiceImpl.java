package com.aincrad.registrationlogin.services;

import com.aincrad.registrationlogin.domain.Role;
import com.aincrad.registrationlogin.domain.RoleRepository;
import com.aincrad.registrationlogin.domain.User;
import com.aincrad.registrationlogin.domain.UserRegistrationDTO;
import com.aincrad.registrationlogin.domain.UserRepository;
import com.aincrad.registrationlogin.services.interfaces.IUserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

@Service
public class UserServiceImpl implements IUserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository,RoleRepository roleRepository) {
        super();
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }
    @Override
    public User save(UserRegistrationDTO registrationDTO) {
        Collection<Role> roles = new ArrayList<>();
        roles.add(roleRepository.findByName("ROLE_USER"));
        User user = new User(
                registrationDTO.getFirstName(),
                registrationDTO.getLastName(),
                registrationDTO.getEmail(),
                registrationDTO.getPassword(),
                roles
                );

        return userRepository.save(user);
    }
}
