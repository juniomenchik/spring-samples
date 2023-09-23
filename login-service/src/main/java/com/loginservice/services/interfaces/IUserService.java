package com.loginservice.services.interfaces;


import com.loginservice.domain.User;
import com.loginservice.domain.UserRegistrationDTO;

public interface IUserService {
    User save(UserRegistrationDTO registrationDTO);
}
