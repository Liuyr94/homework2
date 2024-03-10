package com.bessonov.homework;

import com.bessonov.homework.automobile.*;

public class MainApplication {
    public static void main(String[] args) {
        Engine engine = new V8Engine(2.0, "бензин", "V8");
        Wheels wheels = new BridgestoneWheels(17, "летние", "Bridgestone");
        Car car = new Car(engine, wheels, 5, new String[]{ "B" }, "key123");
        Driver driver = new Driver(10, new String[]{ "B" }, new String[]{ "key123" });

        driver.openCar(car);
        driver.startCar(car);
        driver.driveCar();
        driver.takePassengers();
        driver.refuelCar();
    }
}
