package com.java.crafsmanv2.data;

public class Disk {
    private String owner;
    private String color;
    private double radius;

    public Disk(String owner, String color, double radius) {
        this.owner = owner;
        this.color = color;
        this.radius = radius;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double PI = 3.14;
        return  PI * (radius * radius);
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Radius: [{" + "owner= " + owner + "}, {color= " + color + "}, {radius= " + radius + "}]";
    }

    public void paintShape() {
        System.out.print("Radius: [\n\t\t{ " + "owner  = " + owner + " }, \n\t\t{ color  = " + color + " }, \n\t\t{ radius = " + 
                        radius + " }, \n\t\t{ area   = " + getArea() + " },\n\t]\n");
    }
}

