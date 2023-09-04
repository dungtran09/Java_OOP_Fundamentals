package com.java.crafsmanv4.data;

public class Triangle extends Rectangle {
    private double c;

    public Triangle(String border, String borderColor, String bgColor, double a, double b, double c) {
        super(border, borderColor, bgColor, a, b);
        this.c = c;
    }
    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    
    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return "TRIANGLE : [{" + "border = " + border + "}, {borderColor = " + borderColor + "}, {bg_color = " +
                bgColor + "}, {a = " + a + "}, {b = " + b + "}, {c = " + c + "}]";
    }

    @Override
    public void draw() {
        // System.out.println("TRIANGLE : \n[" + 
        //                    "    \n\t{ Border       = " + border + 
        //                    " }, \n\t{ Border_Color = " + borderColor +
        //                    " }, \n\t{ Bg_Color     = " + bgColor +
        //                    " }, \n\t{ a            = " + a + 
        //                    " }, \n\t{ b            = " + b + 
        //                    " }, \n\t{ c            = " + c + 
        //                    " }, \n\t{ Perimeter    = " + getPerimeter() + 
        //                    " }, \n\t{ Area         = " + getArea() + 
        //                    " }, \n]");
        // System.out.println("-----------------------------------------------------------------------");
        System.out.printf("| %-20s| %-10s| %-10s| %-10s| %-10.2f| %-10.2f|\n", "TRIANGLE", border , borderColor, bgColor, getPerimeter(), getArea());
    }

     
}

