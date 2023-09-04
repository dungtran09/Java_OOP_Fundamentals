package com.java.crafsmanv2.data;

public class Square extends Rectangle {

    public Square (String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }

    @Override
    public String toString() {
        return "Square: [{" + "owner= " + owner + "}, {color= " + color + "}, {edge= " + width + "}]";
    }

    @Override
    public void paintShape() {
        System.out.print("Square: [\n\t\t{ " + "owner  = " + owner + " }, \n\t\t{ color  = " + color + 
                        " }, \n\t\t{ edge   = " + width + " }, \n\t\t{ area   = " + getArea() + " },\n\t]\n");
    }
}
