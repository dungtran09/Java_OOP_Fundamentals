package com.java.crafsmanv3.data;

public class Rectangle {
    private String owner;
    private String color;
    private double height;
    private double width;

    public Rectangle() {

    }

    public Rectangle (String owner, String color, double height, double width) {
        this.owner = owner;
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        return width * height;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectg : [{" + "owner= " + owner + "}, {color= " + color + "}, {height= " + height + "}, {width= " + width + "}]";
    }

    public void paintShape() {
        System.out.println("Rectg : [\n\t\t{ " + "owner  = " + owner + " }, \n\t\t{ color  = " + color + " }, \n\t\t{ height = " + 
                            height + " }, \n\t\t{ width  = " + width + " }, \n\t\t{ area   = " + getArea() + " },\n\t]\n");

    }
}
