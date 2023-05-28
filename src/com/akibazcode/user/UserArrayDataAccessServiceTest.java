package com.akibazcode.user;

import java.util.Arrays;

public class UserArrayDataAccessServiceTest {
    public static void main(String[] args) {
        UserArrayDataAccessService userArrayDataAccessService = new UserArrayDataAccessService();
        System.out.println("All users: " + Arrays.toString(userArrayDataAccessService.getAllUsers()));
    }
}
