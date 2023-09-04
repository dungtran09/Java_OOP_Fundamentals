package com.java.crafsman.main;

import com.java.crafsman.data.Disk;
import com.java.crafsman.data.Rectangle;
import com.java.crafsman.data.Square;

public class App {
    public static void main(String[] args) {
       cutShapes(); 
       shortShapes();
    }

    public static void cutShapes() {
        Rectangle r1 = new Rectangle("Father", "Gray", 1.0, 2.0);
        r1.paintShape(); 

        Square s1 = new Square("Friend", "Pink", 2.5);
        s1.paintShape();

        Disk d1 = new Disk("Wife", "Yellow", 3.0);
        d1.paintShape();
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
