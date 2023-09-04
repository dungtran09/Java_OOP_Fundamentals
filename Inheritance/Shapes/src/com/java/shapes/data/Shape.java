package com.java.shapes.data;

public abstract class Shape {
    protected String border;
    protected String borderColor;
    protected String bgColor;

    public Shape(String border, String borderColor, String bgColor) {
        this.border = border;
        this.borderColor = borderColor;
        this.bgColor = bgColor;
    }

    public String getBorder() {
        return border;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public String getBgColor() {
        return bgColor;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void setBgColor(String bgColor) {
        this.bgColor = bgColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract double getPerimeter();
    public abstract double getArea();
    public abstract void paint();

}
