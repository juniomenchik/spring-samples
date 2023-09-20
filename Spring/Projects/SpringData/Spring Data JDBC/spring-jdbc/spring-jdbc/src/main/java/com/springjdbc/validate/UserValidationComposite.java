package com.springjdbc.validate;

import com.springjdbc.model.User;

public class UserValidationComposite extends ValidationComponent {
    private ValidationComponent[] components;

    public UserValidationComposite(ValidationComponent... components) {
        this.components = components;
    }

    @Override
    public boolean validate(User user) {
        for (ValidationComponent component : components) {
            if (!component.validate(user)) return false;
        }
        return true;
    }
}
