package com.akibazcode.booking;

import java.util.UUID;

public class BookingDAOTest {
    public static void main(String[] args) {
        Booking booking1 = new Booking(UUID.randomUUID(), "1234");
        System.out.println("booking1 = " + booking1);
        BookingDAO bookingDAO = new BookingDAO();
        bookingDAO.addBooking(booking1);
    }
}
