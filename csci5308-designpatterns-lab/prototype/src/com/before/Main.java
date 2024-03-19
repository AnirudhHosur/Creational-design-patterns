package com.before;

import java.util.ArrayList;
import java.util.List;

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

        /** Here the new object is created everytime and values are set to it.
         * Costly operation in real time includes to fetch the data everytime from the database
        */
        Circle anotherCircle = new Circle();
        anotherCircle.x = 10;
        anotherCircle.y = 20;
        anotherCircle.radius = 15;
        anotherCircle.color = "red";
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        for (Shape shape : shapes) {
            shapesCopy.add(shape);
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
