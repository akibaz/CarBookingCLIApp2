package com.akibazcode.car;

import java.util.Arrays;

public class CarDAOTest {
    public static void main(String[] args) {
        CarDAO carDAO = new CarDAO();
        carDAO.getAllCars()[0].setAvailable(false);
        System.out.println(Arrays.toString(carDAO.getAllCars()));
    }
}
