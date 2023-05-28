package com.akibazcode.user;

public class UserServiceTest {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.printAllUsers();
        System.out.println("userService.getUserIds() = " + userService.getUserIds());
        System.out.println("userService.getUserNameById(\"b10d126a-3608-4980-9f9c-aa179f5cebc3\") = " +
                userService.getUserNameById("b10d126a-3608-4980-9f9c-aa179f5cebc3"));
    }
}
