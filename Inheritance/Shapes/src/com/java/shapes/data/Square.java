package com.java.shapes.data;

public class Square extends Rectangle {
    
    public Square (String border, String borderColor, String bgColor, double edge) {
        super(border, borderColor, bgColor, edge, edge);
    }

    @Override
    public void paint() {
        System.out.printf("| %-10s| %-10s| %-10s| %-10s| %-7.2f| %-7.2f| %-10s| %-7.2f| %-7.2f|\n", "SQUARE",
            border , borderColor, bgColor, a, b, "null", getPerimeter(), getArea());
    }  
}
