package com.akibazcode.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    Car tesla;

    @BeforeEach
    public void setup() {
        tesla = new Car("1234", BigDecimal.valueOf(89), Brand.TESLA, true);
    }

    @Test
    @DisplayName("Should Create Car Object")
    public void shouldCreateCarObject() {
        assertNotNull(tesla);
        assertEquals("1234", tesla.getRegNumber());
        assertEquals(BigDecimal.valueOf(89.00).setScale(2, RoundingMode.HALF_UP), tesla.getRentalPricePerDay());
        assertEquals(Brand.TESLA, tesla.getBrand());
        assertTrue(tesla.isElectric());
        assertTrue(tesla.isAvailable());
    }



}