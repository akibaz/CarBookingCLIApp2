package com.akibazcode.car;

public class CarDAOTest {
    public static void main(String[] args) {
        CarDAO carDAO = new CarDAO();
        carDAO.getAllCars().get(0).setAvailable(false);
        System.out.println(carDAO.getAllCars());
    }
}
