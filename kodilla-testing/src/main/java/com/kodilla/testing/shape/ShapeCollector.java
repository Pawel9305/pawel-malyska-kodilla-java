package com.kodilla.testing.shape;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;


public class ShapeCollector {

    List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            result = true;
        }
        return result;
    }

    public Shape getFigure (int n) {
        if (n >= 0 && n < shapeList.size()) {
            return shapeList.get(n);
        }
        return null;
    }

    public String showFigures() {
       return "Shape list" + shapeList;
    }
}
