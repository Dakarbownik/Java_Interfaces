package com.company.shape;

public class Square implements Shape{

    private double length;

    public Square(double length) {
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return length * length;
    }
}
