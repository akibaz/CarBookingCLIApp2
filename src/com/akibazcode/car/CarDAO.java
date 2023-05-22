package com.akibazcode.car;

public class CarDAO {
    private final Car[] cars;
    private final int CAPACITY;
    private static int availableIndex;

    static {
        availableIndex = 0;
    }

    {
        CAPACITY = 3;
        cars = new Car[CAPACITY];
    }


    public void addCar(Car car) {
        if (CAPACITY > availableIndex) {
            cars[availableIndex++] = car;
            System.out.println("Successfully added car " + car.getBrand() + ".");
        } else {
            System.out.println("Can not add car " + car.getBrand() + ". Not enough space in array.");
        }
    }

    public Car[] getAllCars() {
        return cars;
    }

    public Car[] getAllElectricCars() {
        int electricCarsCounter = 0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            if (car.isElectric()) {
                electricCarsCounter++;
            }
        }
        Car[] electricCars = new Car[electricCarsCounter];
        System.arraycopy(cars, 0, electricCars, 0, electricCarsCounter);
        return electricCars;
    }

    public Car[] getAvailableCars() {
        int availableCount = 0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            if (car.isAvailable()) {
                availableCount++;
            }
        }
        Car[] availableCars = new Car[availableCount];
        System.arraycopy(cars, 0, availableCars, 0, availableCount);
        return availableCars;
    }

    public Car[] getAvailableElectricCars() {
        int availableCount = 0;
        for (Car car : cars) {
            if (car == null) {
                break;
            }
            if (car.isAvailable() && car.isElectric()) {
                availableCount++;
            }
        }
        Car[] availableCars = new Car[availableCount];
        System.arraycopy(cars, 0, availableCars, 0, availableCount);
        return availableCars;
    }

    public String getAllRegNumbers() {
        StringBuilder result = new StringBuilder();
        for (Car car : cars) {
            if (car != null) {
                result.append(car.getRegNumber()).append(" ");
            }
        }
        result = new StringBuilder(result.toString().trim());
        return result.toString();
    }
}
