package com.springjdbc.validate;

import com.springjdbc.model.User;

public class UserValidationName extends ValidationComponent {
    @Override
    public boolean validate(User user) {
        if (user.getName() == null || user.getName().isEmpty()) {
            System.out.println("Name is empty");
            throw new IllegalArgumentException("Name is empty");
        }else return true;
    }
}
