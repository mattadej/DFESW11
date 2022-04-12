package org.qa.openclosedsolid.demo.runner;

import org.qa.openclosedsolid.demo.shapes.AreaCalculator;
import org.qa.openclosedsolid.demo.shapes.Circle;
import org.qa.openclosedsolid.demo.shapes.Rectangle;

public class Runner {

    public static void main(String[] args) {

        AreaCalculator shape = new AreaCalculator();
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();


        shape.calculateShapeArea(rectangle);
    }
}
