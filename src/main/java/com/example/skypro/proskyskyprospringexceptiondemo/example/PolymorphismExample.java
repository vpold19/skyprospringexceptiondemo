package com.example.skypro.proskyskyprospringexceptiondemo.example;

import com.example.skypro.proskyskyprospringexceptiondemo.domain.Driver;
import com.example.skypro.proskyskyprospringexceptiondemo.domain.TruckDriver;

public class PolymorphismExample {
    public static void main(String[] args) {
        Driver driver = new TruckDriver("Osky", "Castro", "123", "2345", 1);
        driver.setDriverLicenseNumber("1234");
        System.out.println("driver.getDriverLicenseNumber = " + driver.getDriverLicenseNumber());
        driver.setDriverLicenseNumber("2567");
        System.out.println("driver.getDriverLicenseNumber = " + driver.getDriverLicenseNumber());
        driver.setDriverLicenseNumber("1567");
        System.out.println("driver.getDriverLicenseNumber = " + driver.getDriverLicenseNumber());
    }
}
