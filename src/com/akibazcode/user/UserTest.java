package com.akibazcode.user;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("Baki");
        User user2 = new User("Maki");
        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);
        System.out.println("user2 name: " + user2.getName());
        System.out.println("user2 Id: " + user2.getUserId());
    }
}
