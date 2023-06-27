package com.akibazcode.booking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class BookingDAOTest {
    BookingDAO bookingDAO;
    Booking booking1;
    Booking booking2;

    @BeforeEach
    public void setup() {
        bookingDAO = new BookingDAO();
        booking1 = new Booking(
                UUID.fromString("7e4b9220-a47a-45a7-a33b-7182ee0dc30e"),
                "1234"
        );
        booking2 = new Booking(
                UUID.fromString("7e4b9220-a47a-45a7-233b-7182ee0d1234"),
                "5678"
        );
    }

    @Test
    @DisplayName("Should Add Booking")
    public void shouldAddBookingToBookingsList() {
        assertTrue(bookingDAO.getBookings().isEmpty());
        assertTrue(bookingDAO.addBooking(booking1));
        assertFalse(bookingDAO.getBookings().isEmpty());
        assertEquals(booking1, bookingDAO.getBookings().get(0));

    }

    @Test
    @DisplayName("Should Return All Bookings List")
    public void shouldReturnAllBookingsLis() {
        System.out.println(bookingDAO.getBookings().size()); // Output is 1 because its static field and previous test
                                                            // ads booking
        assertTrue(bookingDAO.addBooking(booking1));
        assertTrue(bookingDAO.addBooking(booking2));
        assertFalse(bookingDAO.getBookings().isEmpty());
        assertEquals(3, bookingDAO.getBookings().size());
    }
}