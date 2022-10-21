package com.kodilla.testing.shape;

import java.util.Objects;

public class Triangle implements Shape{
    private String name;
    private double a;
    private double h;

    public Triangle(String name, double a, double h) {
        this.name = name;
        this.a = a;
        this.h = h;
    }

    public String getShapeName() {
        return this.name;
    }
    
    @Override
    public double getField() {
        return (a * h) / 2;
    }

    @Override
    public String toString() {
        return "Triangle " + name + ", a = " + a + ", h = " + h;
    }



}
