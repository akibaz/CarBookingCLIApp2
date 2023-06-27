package com.akibazcode.car;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CarDAOTest {
    CarDAO carDAO;

    @BeforeEach
    public void setup() {
        carDAO = new CarDAO();
    }

    @Test
    @DisplayName("Should Return A List Of Cars")
    public void shouldGetAllCars() {
        assertFalse(carDAO.getAllCars().isEmpty());
        assertEquals(3, carDAO.getAllCars().size());
        List<Car> expectedCarsList = List.of(
                new Car("1234", BigDecimal.valueOf(89), Brand.TESLA, true),
                new Car("5678", BigDecimal.valueOf(77), Brand.AUDI, false),
                new Car("9101", BigDecimal.valueOf(50), Brand.MERCEDES, false)
        );
        assertEquals(expectedCarsList, carDAO.getAllCars());
    }

}