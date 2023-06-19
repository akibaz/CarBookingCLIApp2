package com.akibazcode.user;

import java.util.UUID;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("Baki", UUID.fromString("8ca51d2b-aaaf-4bf2-834a-e02964e10fc3"));
        User user2 = new User("Maki", UUID.fromString("b10d126a-3608-4980-9f9c-aa179f5cebc3"));
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println("user2 name: " + user2.getName());
        System.out.println("user2 Id: " + user2.getUserId());
    }
}
