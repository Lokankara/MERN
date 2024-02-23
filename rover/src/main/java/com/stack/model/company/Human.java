package com.stack.model.company;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public abstract class Human {
    private final int age;
    private final String name;
    private final Gender gender;

    protected Human(
            String name,
            int age,
            Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
