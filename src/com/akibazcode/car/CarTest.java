package com.akibazcode.car;

import java.math.BigDecimal;

public class CarTest {


    public static void main(String[] args) {
        Car tesla = new Car("1234", BigDecimal.valueOf(89), Brand.TESLA, true);
        Car audi = new Car("5678", BigDecimal.valueOf(77), Brand.AUDI, false);
        Car mercedes = new Car("9101", BigDecimal.valueOf(50), Brand.MERCEDES, false);

        System.out.println(tesla);
        System.out.println(tesla.equals(audi));
        System.out.println(tesla.getRegNumber());
        audi.setRentalPricePerDay(BigDecimal.valueOf(80));
        System.out.println(audi.getRentalPricePerDay());
        System.out.println(mercedes.getBrand());
        System.out.println(mercedes.isElectric());
        System.out.println(mercedes.isAvailable());
    }

}
