package com.java.crafsmanv3.main;

import com.java.crafsmanv3.data.RightTriangle;
import com.java.crafsmanv3.data.Triangle;

public class App {
    public static void main(String[] args) {
        playWithTriangle();
       // shortShapes();
    }

    public static void playWithTriangle() {
        Triangle t1 = new Triangle("Friend", "Gray", 3.0, 4.0, 5.0);
        t1.paintShape(); 
        
        System.out.println("========================================");
        
        RightTriangle rt1 = new RightTriangle("Friend-01", "Blue",  6.0, 8.0);
        rt1.paintShape();
        
        System.out.println("========================================");
        
        RightTriangle rt2 = new RightTriangle("Friend-03", "Red",  6.0, 8.0);
        rt2.paintShape();
    }
}
