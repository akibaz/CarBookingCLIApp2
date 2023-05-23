package com.akibazcode.car;

public class CarDAO {
    private static final Car[] cars;
    private static final int CAPACITY;
    private static int availableIndex;

    static {
        CAPACITY = 3;
        cars = new Car[CAPACITY];
        availableIndex = 0;
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
        Car[] allCars = new Car[availableIndex];
        System.arraycopy(cars, 0, allCars, 0, availableIndex);
        return allCars;
    }

}
