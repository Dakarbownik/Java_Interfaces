package com.company.shape;

public class Cube implements Shape, Shape3d{

    private double length;

    public Cube(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return 6 * length * length;
    }

    @Override
    public double calculateVolume() {
        return length * length * length;
    }
}
