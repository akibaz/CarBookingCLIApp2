package com.akibazcode.user;

public class UserService {
    private final UserArrayDataAccessService userArrayDataAccessService;

    public UserService() {
        userArrayDataAccessService = new UserArrayDataAccessService();
    }

    public void printAllUsers() {
        System.out.println("All users:");
        for (User user : userArrayDataAccessService.getAllUsers()) {
            System.out.println("\t" + user);
        }
    }

    public String getUserIds() {
        StringBuilder userIds = new StringBuilder();
        for (User user : userArrayDataAccessService.getAllUsers()) {
            userIds.append(user.getUserId()).append(" ");
        }
        return userIds.toString().trim();
    }

    public String getUserNameById(String userId) {
        User[] users = userArrayDataAccessService.getAllUsers();
        String name = null;
        for (User user : users) {
            if (user.getUserId().toString().equals(userId)) {
                name = user.getName();
            }
        }
        return name;
    }
}
