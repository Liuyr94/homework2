package com.bessonov.homework.automobile;

public class V8Engine implements Engine {
    double volume;
    String fuel;
    String name;

    public V8Engine(double volume, String fuel, String name) {
        this.volume = volume;
        this.fuel = fuel;
        this.name = name;
    }

    @Override
    public void start() {
        System.out.println("Завожу двигатель V8.");
    }

    
}
