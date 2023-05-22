package com.akibazcode.car;

public class CarService {
    private final CarDAO carDAO;

    public CarService() {
        this.carDAO = new CarDAO();
    }

    public void validateAndAddCar(Car car) {
        String regNumbers = carDAO.getAllRegNumbers();
        if (car == null) {
            System.out.println("Cannot add car. Car cannot be null.");
        } else if (regNumbers.contains(car.getRegNumber())) {
            System.out.println("Cannot add car. Car reg number already taken.");
        } else {
            carDAO.addCar(car);
        }
    }

    public void getAvailableCars() {
        if (carDAO.getAvailableCars() == null) {
            System.out.println("There are no available cars.");
        } else {
            System.out.println("Available cars:");
            for (Car availableCar : carDAO.getAvailableCars()) {
                System.out.println("\t" + availableCar);
            }
        }
    }

    public void getAvailableElectricCars() {
        if (carDAO.getAvailableElectricCars() == null) {
            System.out.println("There are no available electric cars.");
        } else {
            System.out.println("Available electric cars:");
            for (Car availableCar : carDAO.getAvailableElectricCars()) {
                System.out.println("\t" + availableCar);
            }
        }
    }
}
