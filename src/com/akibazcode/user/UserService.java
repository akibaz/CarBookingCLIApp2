package com.akibazcode.user;

public class UserService {
    private final UserDao userDao;

    public UserService() {
        userDao = new UserDao();
    }

    public void printAllUsers() {
        System.out.println("All users:");
        for (User user : userDao.getAllUsers()) {
            System.out.println("\t" + user);
        }
    }

    public String getUserIds() {
        StringBuilder userIds = new StringBuilder();
        for (User user : userDao.getAllUsers()) {
            userIds.append(user.getUserId()).append(" ");
        }
        return userIds.toString().trim();
    }

    public String getUserNameById(String userId) {
        User[] users = userDao.getAllUsers();
        String name = null;
        for (User user : users) {
            if (user.getUserId().toString().equals(userId)) {
                name = user.getName();
            }
        }
        return name;
    }
}
