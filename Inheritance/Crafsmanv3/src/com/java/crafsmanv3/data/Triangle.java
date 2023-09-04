package com.java.crafsmanv3.data;

// tam giac
public class Triangle {
    protected String owner;
    protected String color;
    protected double a, b ,c;

    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b; 
        this.c = c;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getPerimiter() {
        return a + b + c;
    }
     
    public double getArea() {
        double p = getPerimiter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void paintShape() {
        System.out.print("Triangle: \n\t[\n\t\t{ " + "owner  = " + owner + " }, \n\t\t{ color  = " + color + 
                        " }, \n\t\t{ a      = " + a + " }, \n\t\t{ b      = " + b + " }, \n\t\t{ c      = " + c +
                        " }, \n\t\t{ area   = " + getArea() + " },\n\t]\n");
    }
}
