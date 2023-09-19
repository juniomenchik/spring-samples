package com.springjdbc.validate;

import com.springjdbc.model.User;

public class UserValidationEmail extends ValidationComponent {
    @Override
    public boolean validate(User user) {
        if (user.getEmail() == null || user.getEmail().isEmpty()) {
            System.out.println("Email is empty");
            throw new IllegalArgumentException("Email is empty");
        }else return true;
    }
}
