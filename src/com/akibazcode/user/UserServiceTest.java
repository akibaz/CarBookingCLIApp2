package com.akibazcode.user;

public class UserServiceTest {
    public static void main(String[] args) {
        UserService userService = new UserService();
        User maki = new User("Maki");
        User baki = new User("Baki");
        User joki = new User("Joki");
        userService.validateAndAddUser(joki);
        userService.validateAndAddUser(maki);
        userService.validateAndAddUser(baki);
        userService.printAllUsers();
    }
}
