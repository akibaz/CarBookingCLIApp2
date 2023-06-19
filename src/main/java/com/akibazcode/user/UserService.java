package com.akibazcode.user;

import java.util.List;
import java.util.Optional;

public class UserService {
    private final UserFakerDataAccessService userFakerDataAccessService;

    public UserService(UserFakerDataAccessService userFakerDataAccessService) {
        this.userFakerDataAccessService = userFakerDataAccessService;
    }

    public void printAllUsers() {
        if (userFakerDataAccessService.getAllUsers() == null) {
            System.out.println("There is a problem with file.");
            return;
        }
        System.out.println("All users:");
        for (User user : userFakerDataAccessService.getAllUsers()) {
            System.out.println("\t" + user);
        }
    }

    public String getUserIds() {
        StringBuilder userIds = new StringBuilder();
        for (User user : userFakerDataAccessService.getAllUsers()) {
            userIds.append(user.getUserId()).append(" ");
        }
        return userIds.toString().trim();
    }

    public String getUserNameById(String userId) {
        List<User> users = userFakerDataAccessService.getAllUsers();
        Optional<User> user = users.stream().
                filter(u -> u.getUserId().toString().equals(userId)).findFirst();
        return user.get().getName();
    }
}
