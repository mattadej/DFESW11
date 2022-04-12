package org.qa.openclosedsolid.demo.shapes;

import org.qa.openclosedsolid.demo.interfaces.Shape;

public class AreaCalculator {

    public double calculateShapeArea(Shape shape) {
        return shape.calculateArea();
    }

}