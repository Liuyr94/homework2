package com.bessonov.homework.automobile;

public class Car {
    Engine engine;
    Wheels wheels;
    int seats;
    String[] driverLicenseCategory;
    String lock;

    public Car(Engine engine, Wheels wheels, int seats, String[] driverLicenseCategory, String lock) {
        this.engine = engine;
        this.wheels = wheels;
        this.seats = seats;
        this.driverLicenseCategory = driverLicenseCategory;
        this.lock = lock;
    }
}
