package com.after;

public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    public Shape(Shape target) {
        this.x = target.x;
        this.y = target.y;
        this.color = target.color;
    }

    public abstract Shape clone();
}
