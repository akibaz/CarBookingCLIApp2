package com.akibazcode.user;

public class UserFakerDataAccessServiceTest {
    public static void main(String[] args) {
        UserFakerDataAccessService userFakerDataAccessService = new UserFakerDataAccessService();
        userFakerDataAccessService.getAllUsers().forEach(System.out::println);
    }
}
