package com.akibazcode;

import com.akibazcode.booking.BookingService;
import com.akibazcode.car.CarService;
import com.akibazcode.user.UserService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner;
    private static int userInput;
    private static final UserService userService;
    private static final CarService carService;
    private static final BookingService bookingService;

    // Setup
    static {
        scanner = new Scanner(System.in);
        userInput = 0;
        userService = new UserService();
        carService = new CarService();
        bookingService = new BookingService();
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
                case 1 -> bookingService.validateAndAddBooking(carService, userService);
                case 2 -> bookingService.printBookingsByUser(userService);
                case 3 -> bookingService.printAllBookings();
                case 4 -> carService.printAvailableCars();
                case 5 -> carService.printAvailableElectricCars();
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
