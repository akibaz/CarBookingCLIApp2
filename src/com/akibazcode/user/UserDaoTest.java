package com.akibazcode.user;

import java.util.Arrays;

public class UserDaoTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user1 = new User("Baki");
        userDao.addUser(user1);
        System.out.println("All users: " + Arrays.toString(userDao.getAllUsers()));
        User user2 = new User("Maki");
        userDao.addUser(user2);
        System.out.println("All users: " + Arrays.toString(userDao.getAllUsers()));
        User user3 = new User("Maki");
        userDao.addUser(user3);
        System.out.println("All users: " + Arrays.toString(userDao.getAllUsers()));
    }
}
