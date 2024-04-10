package com.stack.company.model;

import com.stack.company.service.EmailValidator;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private String email;

    public void setEmail(final String email) {
        EmailValidator.checkEmail(email);
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;

        return Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(email);
    }
}
