package com.akibazcode.car;

import java.util.List;
import java.util.Optional;

public class CarService {
    private final CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public void printAvailableCars() {
        List<Car> cars = carDAO.getAllCars();
        if (cars.stream().filter(Car::isAvailable).toList().size() == 0) {
            System.out.println("There are no available cars.");
            return;
        }
        System.out.println("Available cars:");
        cars.stream().filter(Car::isAvailable).forEach(System.out::println);
    }

    public void printAvailableElectricCars() {
        List<Car> cars = carDAO.getAllCars();
        if (cars.stream().filter(Car::isAvailable).filter(Car::isElectric).toList().size() == 0) {
            System.out.println("There are no available electric cars.");
            return;
        }
        System.out.println("Available electric cars:");
        cars.stream().filter(Car::isAvailable).filter(Car::isElectric).forEach(System.out::println);
    }

    public String getRegNumbers() {
        List<Car> cars = carDAO.getAllCars();
        StringBuilder regNumbers = new StringBuilder();
        cars.forEach(car -> regNumbers.append(car.getRegNumber()).append(" "));
        return regNumbers.toString().trim();
    }

    public String getCarByRegNumber(String regNumber) {
        List<Car> cars = carDAO.getAllCars();
        Optional<Car> resultCar = cars.stream().filter(car -> car.getRegNumber().equals(regNumber)).
                findFirst();
        return resultCar.get().toString();
    }

    public void setCarAvailableToFalse(String regNumber) {
        List<Car> cars = carDAO.getAllCars();
        cars.stream().filter(car -> car.getRegNumber().equals(regNumber))
                .forEach(car -> car.setAvailable(false));
    }

    public boolean isThereAvailableCar() {
        List<Car> cars = carDAO.getAllCars();
        return cars.stream().filter(Car::isAvailable).toList().size() != 0;
    }
}
