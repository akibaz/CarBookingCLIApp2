package com.akibazcode.user;

import java.util.UUID;

public class UserDao {
    private static final User[] users;

    static {
        users = new User[] {
                new User("Baki", UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3")),
                new User("Maki", UUID.fromString("b10d126a-3608-4980-9f9c-aa179f5cebc3"))
        };
    }

    public User[] getAllUsers() {
        return users;
    }
}
