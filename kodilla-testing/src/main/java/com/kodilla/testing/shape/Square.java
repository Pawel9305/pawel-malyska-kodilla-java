package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private String name;
    private double a;

    public Square(String name, double a) {
        this.name = name;
        this.a = a;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        double field = a * a;
        return field;
    }

    @Override
    public String toString() {
        return "Square " + name + ", a = " + a;
    }

}
