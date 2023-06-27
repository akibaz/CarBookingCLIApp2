package com.akibazcode.booking;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class BookingTest {
    Booking booking;

    @BeforeEach
    public void setup() {
        booking = new Booking(
                UUID.fromString("7e4b9220-a47a-45a7-a33b-7182ee0dc30e"),
                "1234"
        );
    }

    @Test
    @DisplayName("Should Return Booking Reference UUID")
    public void shouldReturnBookingId() {
        assertNotNull(booking.getBookingReference());
    }

    @Test
    @DisplayName("Should Return User UUID")
    public void shouldReturnUserUUID() {
        assertNotNull(booking.getUserId());
        assertEquals(UUID.fromString("7e4b9220-a47a-45a7-a33b-7182ee0dc30e"),
                booking.getUserId());
    }
}