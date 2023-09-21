package com.loginservice.services;

import java.util.ArrayList;
import java.util.Collection;

import com.loginservice.domain.Role;
import com.loginservice.domain.RoleRepository;
import com.loginservice.domain.User;
import com.loginservice.domain.UserRegistrationDTO;
import com.loginservice.domain.UserRepository;
import com.loginservice.services.interfaces.IUserService;
import org.springframework.stereotype.Service;

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
