package com.java.crafsmanv3.data;

// tam giac vuong
public class RightTriangle extends Triangle {
    public RightTriangle (String onwer, String color, double a, double b) {
        // pitago right triangle formula
        super(onwer, color, a, b, Math.sqrt(a*a + b*b));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void paintShape() {
        System.out.print("RightTriangle: \n\t[\n\t\t{ " + "owner  = " + owner + " }, \n\t\t{ color  = " + color + 
                        " }, \n\t\t{ a      = " + a + " }, \n\t\t{ b      = " + b + " }, \n\t\t{ area   = " + getArea() + " },\n\t]\n");
    }
}
