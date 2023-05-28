package com.akibazcode.car;

import java.math.BigDecimal;

public class CarDAO {
    private static final Car[] cars;

    static {
        cars = new Car[]{
                new Car("1234", BigDecimal.valueOf(89), Brand.TESLA, true),
                new Car("5678", BigDecimal.valueOf(77), Brand.AUDI, false),
                new Car("9101", BigDecimal.valueOf(50), Brand.MERCEDES, false)
        };
    }

    public Car[] getAllCars() {
        return cars;
    }
}
