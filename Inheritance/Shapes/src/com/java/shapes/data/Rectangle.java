package com.java.shapes.data;

public class Rectangle extends Shape {

    protected double a;
    protected double b;

    public Rectangle(String border, String borderColor, String bgColor, double a, double b) {
        super(border, borderColor, bgColor);
            this.a = a;
            this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public void paint() {
        System.out.printf("| %-10s| %-10s| %-10s| %-10s| %-7.2f| %-7.2f| %-10s| %-7.2f| %-7.2f|\n", "RECTANGLE",
            border , borderColor, bgColor, a, b, "null", getPerimeter(), getArea());
    }
}
