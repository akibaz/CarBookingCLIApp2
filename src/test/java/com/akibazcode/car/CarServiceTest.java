package com.akibazcode.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarServiceTest {
    CarService carService;
    CarDAO carDAO;

    @BeforeEach
    public void setup() {
        carDAO = new CarDAO();
        carService = new CarService(carDAO);
    }

    @Test
    @DisplayName("Should Return All Registration Numbers As String")
    public void shouldGetRegNumbers() {
        assertFalse(carService.getRegNumbers().isEmpty());
        assertEquals("1234 5678 9101", carService.getRegNumbers());
    }

    @Test
    @DisplayName("Should Return A Car As String By Reg Number")
    public void shouldGetCarByRegNumber() {
        assertFalse(carService.getCarByRegNumber("1234").isEmpty());
        assertTrue(carService.getCarByRegNumber("1234").contains("TESLA"));
    }

    @Test
    @DisplayName("Should Set Availability Of Car To False")
    public void shouldSetCarAvailableToFalse() {
        carService.setCarAvailableToFalse("1234");
        assertFalse(carDAO.getAllCars().stream()
                .map(car -> !car.isAvailable()).toString().contains("1234"));
    }

    @Test
    @DisplayName("Should Return true If There Is Available Car")
    public void shouldReturnTrueIfThereIsAvailableCar() {
        assertTrue(carService.isThereAvailableCar());
        carService.setCarAvailableToFalse("1234");
        carService.setCarAvailableToFalse("5678");
        carService.setCarAvailableToFalse("9101");
        assertFalse(carService.isThereAvailableCar());
    }
}