package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{

    private String name;
    private double r;

    public Circle(String name, double r) {
        this.name = name;
        this.r = r;
    }

    @Override
    public String getShapeName() {
        return this.name;
    }

    @Override
    public double getField() {
        final double PI = 3.14;
        double field = PI * (r * r);
        return field;
    }

    @Override
    public String toString() {
        return "Circle: " + name + ", r = " + r;
    }
}
