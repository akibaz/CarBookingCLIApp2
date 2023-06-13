package com.akibazcode.booking;

import java.util.ArrayList;
import java.util.List;

public class BookingDAO {
    private static final List<Booking> bookings;

    static {
        bookings = new ArrayList<>();
    }

    public boolean addBooking(Booking booking) {
        bookings.add(booking);
        return true;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
