package com.akibazcode.user;

import java.util.Objects;
import java.util.UUID;

public class User {
    private final UUID userId;
    private final String name;


    public User(String name, UUID userId) {
        this.name = name;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public UUID getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId) && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, name);
    }
}
