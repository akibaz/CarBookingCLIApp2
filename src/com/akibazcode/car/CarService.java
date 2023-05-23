package com.akibazcode.car;

public class CarService {
    private final CarDAO carDAO;

    public CarService() {
        this.carDAO = new CarDAO();
    }

    public void validateAndAddCar(Car car) {
        StringBuilder regNumbersString = new StringBuilder();
        for (Car c : carDAO.getAllCars()) {
            if (c != null) {
                regNumbersString.append(c.getRegNumber()).append(" ");
            }
        }
        regNumbersString = new StringBuilder(regNumbersString.toString().trim());
        String regNumbers = regNumbersString.toString().trim();

        if (car == null) {
            System.out.println("Cannot add car. Car cannot be null.");
        } else if (regNumbers.contains(car.getRegNumber())) {
            System.out.println("Cannot add car. Car reg number already taken.");
        } else {
            carDAO.addCar(car);
        }
    }

    public void printAvailableCars() {
        Car[] cars = carDAO.getAllCars();
        if (cars == null) {
            System.out.println("There are no available cars.");
            return;
        }
        boolean hasAvailableCar = false;
        for (Car car : cars) {
            if (car.isAvailable()) {
                hasAvailableCar = true;
                break;
            }
        }

        if (hasAvailableCar) {
            System.out.println("Available cars:");
            for (Car car : cars) {
                if (car.isAvailable()) {
                    System.out.println("\t" + car);
                }
            }
        } else {
            System.out.println("There are no available cars.");
        }
    }

    public void printAvailableElectricCars() {
        Car[] cars = carDAO.getAllCars();
        if (cars == null) {
            System.out.println("There are no available electric cars.");
            return;
        }
        boolean hasAvailableElectricCar = false;
        for (Car car : cars) {
            if (car.isElectric() && car.isAvailable()) {
                hasAvailableElectricCar = true;
                break;
            }
        }

        if (hasAvailableElectricCar) {
            System.out.println("Available electric cars:");
            for (Car car : cars) {
                if (car.isElectric() && car.isAvailable()) {
                    System.out.println("\t" + car);
                }
            }
        } else {
            System.out.println("There are no available electric cars.");
        }
    }

    public String getRegNumbers() {
        Car[] cars = carDAO.getAllCars();
        StringBuilder regNumbers = new StringBuilder();
        for (Car car : cars) {
            regNumbers.append(car.getRegNumber()).append(" ");
        }
        return regNumbers.toString().trim();
    }

    public String getCarByRegNumber(String regNumber) {
        Car[] cars = carDAO.getAllCars();
        String carResult = null;
        for (Car car : cars) {
            if (car.getRegNumber().equals(regNumber)) {
                carResult = car.toString();
                break;
            }
        }
        return carResult;
    }

    public void setCarAvilableToFalse(String regNumber) {
        Car[] cars = carDAO.getAllCars();
        for (Car car : cars) {
            if (car.getRegNumber().equals(regNumber)) {
                car.setAvailable(false);
                break;
            }
        }
    }

    public boolean isThereAvailableCar() {
        Car[] cars = carDAO.getAllCars();
        for (Car car : cars) {
            if (car.isAvailable()) {
                return true;
            }
        }
        return false;
    }
}
