package com.java.crafsmanv4.data;

public class Square extends Rectangle {

    public Square (String border, String borderColor, String bgColor, double edge) {
        super(border, borderColor, bgColor, edge, edge);
    }

    @Override
    public String toString() {
        return "SQUARE : [{" + "border = " + border + "}, {borderColor = " + borderColor + "}, {bg_color = " +
                bgColor + "}, {edge = " + getA() + "},]";
    }

    @Override
    public void draw() {
        // System.out.println("SQUARE : \n[" + 
        //                    "    \n\t{ Border       = " + border + 
        //                    " }, \n\t{ Border_Color = " + borderColor +
        //                    " }, \n\t{ Bg_Color     = " + bgColor +
        //                    " }, \n\t{ Edge         = " + getA() + 
        //                    " }, \n\t{ Perimeter    = " + getPerimeter() + 
        //                    " }, \n\t{ Area         = " + getArea() + 
        //                    " }, \n]");
        // System.out.println("-----------------------------------------------------------------------");
        System.out.printf("| %-20s| %-10s| %-10s| %-10s| %-10.2f| %-10.2f|\n", "SQUARE", border , borderColor, bgColor, getPerimeter(), getArea());
    }
}
