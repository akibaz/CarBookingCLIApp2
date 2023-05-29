package com.akibazcode.car;

public class CarServiceTest {
    public static void main(String[] args) {
        CarService carService = new CarService(new CarDAO());
        carService.printAvailableCars();
        carService.printAvailableElectricCars();
        System.out.println("carService.isThereAvailableCar() = " + carService.isThereAvailableCar());
        System.out.println("carService.getCarByRegNumber(\"1234\") = " + carService.getCarByRegNumber("1234"));
        System.out.println("carService.getRegNumbers() = " + carService.getRegNumbers());
        carService.setCarAvilableToFalse("1234");
        carService.printAvailableCars();
    }
}
