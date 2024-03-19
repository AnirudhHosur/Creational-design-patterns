package com.after;

public class Circle extends Shape {
    public int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        this.radius = target.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
