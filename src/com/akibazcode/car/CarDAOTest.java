package com.akibazcode.car;

import java.math.BigDecimal;
import java.util.Arrays;

public class CarDAOTest {
    public static void main(String[] args) {
        Car tesla = new Car("1234", BigDecimal.valueOf(89), Brand.TESLA, true);
        Car audi = new Car("5678", BigDecimal.valueOf(77), Brand.AUDI, false);
        Car mercedes = new Car("9101", BigDecimal.valueOf(50), Brand.MERCEDES, false);

        CarDAO carDAO = new CarDAO();
        carDAO.addCar(tesla);
        carDAO.addCar(audi);
        carDAO.addCar(mercedes);
        System.out.println(Arrays.toString(carDAO.getAllCars()));
        carDAO.getAllCars()[0].setAvailable(false);

        Car fiat = new Car("3333", BigDecimal.valueOf(33), Brand.AUDI, false);
        carDAO.addCar(fiat);
    }
}
