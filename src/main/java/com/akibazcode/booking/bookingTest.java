package com.akibazcode.booking;

import java.util.UUID;

public class bookingTest {
    public static void main(String[] args) {
        Booking booking1 = new Booking(UUID.randomUUID(), "1234");
        System.out.println("booking1 = " + booking1);
        System.out.println("booking1 reference = " + booking1.getBookingReference());
        System.out.println("booking1 reg number = " + booking1.getCarRegNumber());
        System.out.println("booking1 user Id = " + booking1.getUserId());
    }
}
