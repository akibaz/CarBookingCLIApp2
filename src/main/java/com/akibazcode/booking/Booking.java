package com.akibazcode.booking;

import java.util.Objects;
import java.util.UUID;

public class Booking {
    private final UUID bookingReference;
    private final UUID userId;
    private final String carRegNumber;

    public Booking(UUID userId, String carRegNumber) {
        this.userId = userId;
        this.carRegNumber = carRegNumber;
        this.bookingReference = UUID.randomUUID();
    }

    public UUID getBookingReference() {
        return bookingReference;
    }

    public UUID getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingReference=" + bookingReference +
                ", userId=" + userId +
                ", carRegNumber='" + carRegNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(bookingReference, booking.bookingReference) && Objects.equals(userId, booking.userId) && Objects.equals(carRegNumber, booking.carRegNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingReference, userId, carRegNumber);
    }
}
