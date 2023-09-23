package com.springjdbc.validate;

import com.springjdbc.model.User;

public class UserValidationPassword extends ValidationComponent {
    @Override
    public boolean validate(User user) {
        if (user.getPassword() == null || user.getPassword().isEmpty()) {
            System.out.println("Password is empty");
            throw new IllegalArgumentException("Password is empty");
        }else return true;
    }
}
