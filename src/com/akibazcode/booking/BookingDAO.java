package com.akibazcode.booking;

public class BookingDAO {
    private static final Booking[] bookings;
    private static final int CAPACITY;
    private static int availableIndex;

    static {
        CAPACITY = 5;
        bookings = new Booking[CAPACITY];
        availableIndex = 0;
    }

    public boolean addBooking(Booking booking) {
        if (CAPACITY > availableIndex) {
            bookings[availableIndex++] = booking;
            return true;
        } else {
            System.out.println("Cannot add booking. There is no space in array.");
        }
        return false;
    }

    public Booking[] getBookings() {
        return bookings;
    }
}
