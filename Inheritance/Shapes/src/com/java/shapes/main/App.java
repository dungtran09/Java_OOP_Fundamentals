package com.java.shapes.main;

import com.java.shapes.data.Disk;
import com.java.shapes.data.Rectangle;
import com.java.shapes.data.Shape;
import com.java.shapes.data.Square;

public class App {
    public static void main(String[] args) {
        sortShape();
    }

    public static void sortShape() {
        Shape[] listShapes = new Shape[] {
                                            new Rectangle("1px", "#000000", "#222222", 5.0, 6.0),
                                            new Rectangle("2px", "#000000", "#222222", 6.0, 5.0),
                                            new Square("15px", "#ffFFFF", "#909090", 7.0),
                                            new Square("10px", "#CCCCCC", "#555555", 8.0),
                                            new Square("5px", "#BBBBBB", "#444444", 9.0),
                                            new Disk("5px", "#DADADA", "#333333", 2.0),
                                            new Disk("1px", "#FFFFFF", "#AAAAAA", 1.0),
                                         };

        System.out.println("BERFORE SORT: ");
        System.out.println("+-----------+-----------+-----------+-----------+--------+--------+-----------+--------+--------+");
        System.out.println("| NAME      | BORDER    | BD_COLOR  | BG_COLOR  | WIDTH  | LENGTH | RADIUS    | PER    | AREA   |");
        System.out.println("+-----------+-----------+-----------+-----------+--------+--------+-----------+--------+--------+");
        for (Shape shape : listShapes) {
            shape.paint();
        }
        System.out.println("+-----------+-----------+-----------+-----------+--------+--------+-----------+--------+--------+");
        System.out.println("AFTER SORT: ");

        for (int i = 0; i < listShapes.length; i++) {
            for (int j = i + 1; j < listShapes.length; j++) {
                if (listShapes[i].getArea() > listShapes[j].getArea()) {
                    Shape temp = listShapes[i];
                    listShapes[i] = listShapes[j];
                    listShapes[j] = temp;
                }
            }
        }
    
        // print list after sort by area
        System.out.println("+-----------+-----------+-----------+-----------+--------+--------+-----------+--------+--------+");
        System.out.println("| NAME      | BORDER    | BD_COLOR  | BG_COLOR  | WIDTH  | LENGTH | RADIUS    | PER    | AREA   |");
        System.out.println("+-----------+-----------+-----------+-----------+--------+--------+-----------+--------+--------+");
        for (Shape shape : listShapes) {
            shape.paint();
        }
        System.out.println("+-----------+-----------+-----------+-----------+--------+--------+-----------+--------+--------+");

    }
}
