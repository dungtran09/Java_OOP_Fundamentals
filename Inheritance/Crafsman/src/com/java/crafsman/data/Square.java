package com.java.crafsman.data;

public class Square {
    private String owner;
    private String color;
    private double edge;

    public Square(String owner, String color, double edge) {
        this.owner = owner;
        this.color = color;
        this.edge = edge;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public double getEdge() {
        return edge;
    }

    public double getArea() {
        return Math.pow(edge, 2);
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Square: [{" + "owner= " + owner + "}, {color= " + color + "}, {edge= " + edge + "}]";
    }

    public void paintShape() {
        System.out.print("Square: [\n\t\t{ " + "owner  = " + owner + " }, \n\t\t{ color  = " + color + 
                        " }, \n\t\t{ edge   = " + edge + " }, \n\t\t{ area   = " + getArea() + " },\n\t]\n");
    }
}
