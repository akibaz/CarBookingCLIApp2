package com.akibazcode.car;

import java.math.BigDecimal;

public class CarServiceTest {
    public static void main(String[] args) {
        CarService carService = new CarService();
        Car tesla = new Car("1234", BigDecimal.valueOf(89), Brand.TESLA, true);
        Car audi = new Car("5678", BigDecimal.valueOf(77), Brand.AUDI, false);
        Car mercedes = new Car("9101", BigDecimal.valueOf(50), Brand.MERCEDES, false);
        carService.validateAndAddCar(tesla);
        carService.printAvailableCars();
        carService.validateAndAddCar(tesla);
        carService.printAvailableCars();
        carService.validateAndAddCar(audi);
        carService.validateAndAddCar(mercedes);
        carService.printAvailableCars();
        carService.printAvailableElectricCars();

    }
}
