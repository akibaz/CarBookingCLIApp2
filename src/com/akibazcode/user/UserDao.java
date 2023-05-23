package com.akibazcode.user;

public class UserDao {
    private static final User[] users;
    private static final int CAPACITY;
    private static int availableIndex;

    static {
        CAPACITY = 2;
        users = new User[CAPACITY];
        availableIndex = 0;
    }

    public void addUser(User user) {
        if (CAPACITY > availableIndex) {
                users[availableIndex++] = user;
                System.out.println("Successfully added user " + user.getName() + ".");
        } else {
            System.out.println("Cannot add user " + user.getName() + ". Not enough space in array.");
        }

    }

    public User[] getAllUsers() {
        User[] allUsers = new User[availableIndex];
        for (int i = 0; i < availableIndex; i++) {
            if (users[i] != null) {
                allUsers[i] = users[i];
            } else {
                break;
            }
        }
        return allUsers;
    }



}
