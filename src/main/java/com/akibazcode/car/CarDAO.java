package com.akibazcode.car;

import java.math.BigDecimal;
import java.util.List;

public class CarDAO {
    private static final List<Car> cars;

    static {
        cars = List.of(
                new Car("1234", BigDecimal.valueOf(89), Brand.TESLA, true),
                new Car("5678", BigDecimal.valueOf(77), Brand.AUDI, false),
                new Car("9101", BigDecimal.valueOf(50), Brand.MERCEDES, false)
        );
    }

    public List<Car> getAllCars() {
        return cars;
    }
}
