package com.akibazcode.user;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class UserFakerDataAccessService implements UserDAO {
    static final List<User> users;
    static final Faker faker;

    static {
        users = new ArrayList<>();
        faker = new Faker();
        for (int i = 0; i < 20; i++) {
            users.add(new User(
                    faker.name().fullName(),
                    UUID.randomUUID()
            ));
        }
    }
    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
