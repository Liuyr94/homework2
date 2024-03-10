package com.bessonov.homework.automobile;

public class BridgestoneWheels implements Wheels {
    int radius;
    String season;
    String name;

    public BridgestoneWheels(int radius, String season, String name) {
        this.radius = radius;
        this.season = season;
        this.name = name;
    }

    @Override
    public void rotate() {
        System.out.println("Колеса Bridgestone вращаются.");
    }
}
