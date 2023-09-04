package com.java.crafsmanv4.data;

public class Rectangle extends Shape {
    protected double a, b;

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
        return 2 * (a + b);
    }
    
    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return "RECTANGLE : [{" + "border = " + border + "}, {borderColor = " + borderColor + "}, {bg_color = " +
                bgColor + "}, {a = " + a + "}, {b = " + b + "}]";
    }

    @Override
    public void draw() {
        // System.out.println("RECTANGLE : \n[" + 
        //                    "    \n\t{ Border       = " + border + 
        //                    " }, \n\t{ Border_Color = " + borderColor +
        //                    " }, \n\t{ Bg_Color     = " + bgColor +
        //                    " }, \n\t{ a            = " + a + 
        //                    " }, \n\t{ b            = " + b + 
        //                    " }, \n\t{ Perimeter    = " + getPerimeter() + 
        //                    " }, \n\t{ Area         = " + getArea() + 
        //                    " }, \n]");
        // System.out.println("-----------------------------------------------------------------------");
        System.out.printf("| %-20s| %-10s| %-10s| %-10s| %-10.2f| %-10.2f|\n", "RECTANGLE", border , borderColor, bgColor, getPerimeter(), getArea());
    }
}
