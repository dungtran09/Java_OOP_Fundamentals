package com.java.crafsmanv4.data;

public class Disk extends Shape {
    private double radius;
    private final double PI = 3.14;

    public Disk(String border, String borderColor, String bgColor, double radius) {
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
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "DISK : [{" + "border = " + border + "}, {borderColor = " + borderColor +
               "}, {bg_color = " + bgColor + "}, {radius = " + radius + "}]";
    }

    @Override
    public void draw() {
        // System.out.println("DISK : \n[" + 
        //                    "    \n\t{ Border       = " + border + 
        //                    " }, \n\t{ Border_Color = " + borderColor +
        //                    " }, \n\t{ Bg_Color     = " + bgColor +
        //                    " }, \n\t{ Radius       = " + radius + 
        //                    " }, \n\t{ Perimeter    = " + getPerimeter() + 
        //                    " }, \n\t{ Area         = " + getArea() + 
        //                    " }, \n]");
        // System.out.println("-----------------------------------------------------------------------");
        System.out.printf("| %-20s| %-10s| %-10s| %-10s| %-10.2f| %-10.2f|\n", "DISK", border , borderColor, bgColor, getPerimeter(), getArea());
    }


}

