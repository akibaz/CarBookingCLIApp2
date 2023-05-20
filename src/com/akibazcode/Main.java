package com.akibazcode;

import com.akibazcode.user.User;
import com.akibazcode.user.UserService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner;
    private static int userInput;
    private static final User baki;
    private static final User maki;
    private static final UserService userService;

    // Setup
    static {
        scanner = new Scanner(System.in);
        userInput = 0;
        baki = new User("Baki");
        maki = new User("Maki");
        userService = new UserService();
        userService.validateAndAddUser(baki);
        userService.validateAndAddUser(maki);
    }

    public static void main(String[] args) {

        while (true) {
            System.out.println("""
                    1 - Book Car
                    2 - Get All User Booked Cars
                    3 - View All Bookings
                    4 - View Available Cars
                    5 - View Available Electric Cars
                    6 - View All Users
                    7 - Exit Application""");

            getValidatedUserInput();

            switch (userInput) {
                case 6 -> userService.printAllUsers();
                case 7 -> {
                    System.out.println("Bye.");
                    return; }
                default -> System.out.println("Please enter number between 1 and 7.");
            }
        }
    }

    private static void getValidatedUserInput() {
        try {
            userInput = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("""
                    Invalid input ❌.
                    Please enter integer number.""");
            scanner.next();
        }
    }
}
