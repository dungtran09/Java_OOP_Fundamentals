package com.java.crafsmanv4.data;

public class RightTriangle extends Triangle {
    public RightTriangle(String border, String borderColor, String bgColor, double a, double b) {
        super(border, borderColor, bgColor, a, b, Math.sqrt(a*a + b*b));
    }

    @Override
    public String toString() {
        return "RIGHTTRIANGLE : [{" + "border = " + border + "}, {borderColor = " + borderColor + "}, {bg_color = " +
                bgColor + "}, {a = " + a + "}, {b = " + b + "}, {c = " + getC() + "}]";
    }

    @Override
    public void draw() {
        // System.out.println("RIGHTTRIANGLE : \n[" + 
        //                    "    \n\t{ Border       = " + border + 
        //                    " }, \n\t{ Border_Color = " + borderColor +
        //                    " }, \n\t{ Bg_Color     = " + bgColor +
        //                    " }, \n\t{ a            = " + a + 
        //                    " }, \n\t{ b            = " + b + 
        //                    " }, \n\t{ c            = " + getC() + 
        //                    " }, \n\t{ Perimeter    = " + getPerimeter() + 
        //                    " }, \n\t{ Area         = " + getArea() + 
        //                    " }, \n]");
        // System.out.println("-----------------------------------------------------------------------");
        System.out.printf("| %-20s| %-10s| %-10s| %-10s| %-10.2f| %-10.2f|\n", "RIGHTTRIANGLE", border , borderColor, bgColor, getPerimeter(), getArea());
    }

}
