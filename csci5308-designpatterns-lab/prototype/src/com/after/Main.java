package com.after;

import java.util.ArrayList;
import java.util.List;

/**
 * Prototype design pattern is used when the Object creation is a costly affair and requires a lot
 * of time and resources and you have a similar object already existing.
 */

public class Main {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        /** Prototype design pattern mandates that the Object which you are copying
         * should provide the copying feature. It should not be done by any other class.
         * However whether to use shallow or deep copy of the Object properties depends
         * on the requirements and its a design decision.
         * */
        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        System.out.println("Items in shape: ");
        for (Shape shape : shapes) {
            System.out.println("X : " + shape.x + "\t" + "Y : " +shape.y + "\t" + "Color : " + shape.color);
        }

        System.out.println("Items in shape copy: ");
        for (Shape copy : shapesCopy) {
            System.out.println("X : " + copy.x + "\t" + "Y : " +copy.y + "\t" + "Color : " + copy.color);
        }
    }
}
