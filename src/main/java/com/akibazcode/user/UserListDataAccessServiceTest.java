package com.akibazcode.user;

public class UserListDataAccessServiceTest {
    public static void main(String[] args) {
        UserListDataAccessService userArrayDataAccessService = new UserListDataAccessService();
        System.out.println("All users: " + userArrayDataAccessService.getAllUsers());
    }
}
