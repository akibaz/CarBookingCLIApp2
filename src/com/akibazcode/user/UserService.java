package com.akibazcode.user;

import java.util.Arrays;

public class UserService {
    private final UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }

    public void validateAndAddUser(User user) {
        if (user == null) {
            System.out.println("Cannot add user. User must have name.");
        } else {
            userDao.addUser(user);
        }
    }

    public void printAllUsers() {
        for (User user : userDao.getAllUsers()) {
            System.out.println(user);
        }
    }
}
