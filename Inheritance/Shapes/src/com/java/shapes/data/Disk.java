package com.java.shapes.data;

public class Disk extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Disk (String border, String borderColor, String bgColor, double radius) {
        super(border, borderColor, bgColor);
        this.radius = radius;
    } 

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override 
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    @Override
    public void paint() {
        System.out.printf("| %-10s| %-10s| %-10s| %-10s| %-7s| %-7s| %-10.2f| %-7.2f| %-7.2f|\n", "RADIUS",
            border , borderColor, bgColor, "null" , "null", radius, getPerimeter(), getArea());
    }
}
