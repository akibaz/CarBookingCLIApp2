package com.akibazcode.user;

import java.util.Arrays;

public class UserDaoTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println("All users: " + Arrays.toString(userDao.getAllUsers()));
    }
}
