package com.aincrad.registrationlogin.services.interfaces;

import com.aincrad.registrationlogin.domain.User;
import com.aincrad.registrationlogin.domain.UserRegistrationDTO;

public interface IUserService {
    User save(UserRegistrationDTO registrationDTO);
}
