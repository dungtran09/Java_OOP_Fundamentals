package com.java.crafsmanv2.main;

import com.java.crafsmanv2.data.Disk;
import com.java.crafsmanv2.data.Rectangle;
import com.java.crafsmanv2.data.Square;

public class App {
    public static void main(String[] args) {
       playWithChildClass(); 
       // shortShapes();
    }

    public static void playWithChildClass() {
        Square s1 = new Square("Girld-Friend", "Cyan", 5.0);
        s1.paintShape();
    }

    public static void shortShapes() {
        Rectangle[] rectArr = new Rectangle[3];

        rectArr[0] = new Rectangle("Wife-01", "Black", 3.0, 2.0);
        rectArr[1] = new Rectangle("Wife-02", "Black", 2.5, 2.5);
        rectArr[2] = new Rectangle("Wife-03", "Black", 1.0, 2.2);
        // rectArr[3] = new Rectangle("Wife-04", "Black", 5.0, 1.5);
        // rectArr[4] = new Rectangle("Wife-05", "Black", 3.0, 4.0);
        // rectArr[5] = new Rectangle("Wife-06", "Black", 5.0, 2.0);

        for (int i = 0; i < rectArr.length; i++) {
            for (int j = i + 1; j < rectArr.length; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Rectangle temp = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = temp;
                }
            }
        }

        for (Rectangle rect : rectArr) {
            rect.paintShape();
        }
    }
}
