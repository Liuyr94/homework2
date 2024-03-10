package com.bessonov.homework.automobile;

public class Driver {
    int experience;
    String[] licenseCategories;
    String[] keys;

    public Driver(int experience, String[] licenseCategories, String[] keys) {
        this.experience = experience;
        this.licenseCategories = licenseCategories;
        this.keys = keys;
    }

    public void openCar(Car car) {
        if (keys != null && keys.length > 0 && car.lock.equals(keys[0])) {
            System.out.println("Открываю машину...");
        } else {
            System.out.println("У меня нет нужного ключа для открытия этой машины.");
        }
    }

    public void startCar(Car car) {
        car.engine.start();
        System.out.println("Машина заведена.");
    }

    public void driveCar() {
        System.out.println("Вожу машину.");
    }

    public void takePassengers() {
        System.out.println("Принимаю пассажиров.");
    }

    public void refuelCar() {
        System.out.println("Заправляю машину.");
    }
}

