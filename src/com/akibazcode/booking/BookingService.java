package com.akibazcode.booking;

import com.akibazcode.car.Car;
import com.akibazcode.car.CarService;
import com.akibazcode.user.UserService;

import java.awt.print.Book;
import java.util.Scanner;
import java.util.UUID;

public class BookingService {
    private final BookingDAO bookingDAO;
    private final Scanner scanner;

    public BookingService() {
        this.bookingDAO = new BookingDAO();
        this.scanner = new Scanner(System.in);
    }


    public void validateAndAddBooking(CarService carService, UserService userService) {
        while (true) {
            if (!carService.isThereAvailableCar()) {
                System.out.println("There are no available cars.");
                return;
            }
            userService.printAllUsers();
            System.out.println("Select user id: ");
            String userId = scanner.nextLine();
            if (userId.equals("0")) {
                return;
            }
            if (!userService.getUserIds().contains(userId)) {
                System.out.println("There is no such user id." +
                                    " Please enter new one or enter 0 to exit to main menu.");
                continue;
            }

            String regNumber;
            while (true) {
                carService.printAvailableCars();
                System.out.println("Select car reg number: ");
                regNumber = scanner.nextLine();
                if (regNumber.equals("0")) {
                    return;
                }
                if (!carService.getRegNumbers().contains(regNumber)) {
                    System.out.println("There is no car reg number." +
                            " Please enter new one or enter 0 to exit to main menu.");
                    continue;
                } else {
                    break;
                }
            }

            Booking newBooking = new Booking(UUID.fromString(userId), regNumber);
            if (bookingDAO.addBooking(newBooking)) {
                System.out.println("Successfully booked " + carService.getCarByRegNumber(regNumber) +
                        " for user " + userService.getUserNameById(userId) + ".");
                System.out.println("Booking reference number: " + newBooking.getBookingReference());
                carService.setCarAvilableToFalse(regNumber);
            }
            break;
        }
    }

    public void printAllBookings() {
        Booking[] bookings = bookingDAO.getBookings();
        if (bookings[0] == null) {
            System.out.println("There are no bookings.");
            return;
        }
        System.out.println("All bookings:");
        for (Booking booking : bookings) {
            if (booking != null) {
                System.out.println(booking);
            } else {
                break;
            }

        }
    }
}
