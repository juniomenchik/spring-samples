package com.springjdbc.validate;

import com.springjdbc.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserValidationService {

    private final ValidationComponent validationComponent;

    public UserValidationService() {
        this.validationComponent = new UserValidationComposite(
                new UserValidationName(),
                new UserValidationEmail(),
                new UserValidationPassword()
        );
    }
    public boolean validateUser(User user) {
        return validationComponent.validate(user);
    }
}
