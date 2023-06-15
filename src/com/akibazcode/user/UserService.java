package com.akibazcode.user;

import java.util.List;
import java.util.Optional;

public class UserService {
    private final UserListDataAccessService userArrayDataAccessService;

    public UserService(UserListDataAccessService userListDataAccessService) {
        this.userArrayDataAccessService = userListDataAccessService;
    }

    public void printAllUsers() {
        if (userArrayDataAccessService.getAllUsers() == null) {
            System.out.println("There is a problem with file.");
            return;
        }
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
        List<User> users = userArrayDataAccessService.getAllUsers();
//        String name = null;
        Optional<User> user = users.stream().
                filter(u -> u.getUserId().toString().equals(userId)).findFirst();
//        for (User user : users) {
//            if (user.getUserId().toString().equals(userId)) {
//                name = user.getName();
//            }
//        }
        return user.get().getName();
    }
}
