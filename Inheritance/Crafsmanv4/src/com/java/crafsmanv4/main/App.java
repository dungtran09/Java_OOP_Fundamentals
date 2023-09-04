package com.java.crafsmanv4.main;

import com.java.crafsmanv4.data.Disk;
import com.java.crafsmanv4.data.Rectangle;
import com.java.crafsmanv4.data.RightTriangle;
import com.java.crafsmanv4.data.Shape;
import com.java.crafsmanv4.data.Square;
import com.java.crafsmanv4.data.Triangle;

public class App {
    public static void main(String[] args) {
        sortShapes();
        // playWithShapes();
    }

    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("1.0px", "Black", "Red", 5.0, 6.0);
        r1.draw();

        Shape r2 = new Rectangle("1.5px", "Black", "Yellow", 6.0, 5.0);
        r2.draw();
        
        Disk d1 = new Disk("2.0px", "Black", "Cyan", 6.0);
        d1.draw();

        Shape d2 = new Disk("2.5px", "Black", "Pink", 6.0);
        d2.draw();
    }

    public static void sortShapes() {
        Shape[] box = new Shape[]{
                        new Rectangle("1px", "Brown", "Brown", 5.0, 6.0),
                        new Square("15px", "Red", "Red", 7.0),
                        new Square("10px", "Red", "Red", 8.0),
                        new Square("5px", "Red", "Red", 9.0),
                        new Disk("1px", "Yellow", "Yellow", 6.0),
                        new Disk("1px", "Yellow", "Yellow", 6.0),
                        new Triangle("10px", "Cyan", "Cyan", 3.0 , 4.0, 5.0),
                        new Triangle("15px", "Cyan", "Cyan", 6.0, 8.0, 10.0),
                        new RightTriangle("1px", "Black", "Black", 3.0, 4.0),
                        new RightTriangle("2px", "Black", "Black", 6.0, 8.0),
                        new RightTriangle("3px", "Black", "Black", 6.0, 7.0),
                        // anonymous object
                        new Shape("10px", "Blue", "Blue") {
                            @Override
                            public double getPerimeter() {
                                return 15.5;
                            }
                            @Override
                            public double getArea() {
                                return 20.0;
                            }
                            @Override 
                            public void draw() {
                                System.out.printf("| %-20s| %-10s| %-10s| %-10s| %-10.2f| %-10.2f|\n", "NO NAME",
                                    border , borderColor, bgColor, getPerimeter(), getArea());
                            }
                        },
                    }; 

    for (int i = 0; i < box.length; i++) {
        for (int j = i + 1; j < box.length; j++) {
            if (box[i].getArea() > box[j].getArea()) {
                Shape temp = box[i];
                    box[i] = box[j];
                    box[j] = temp;
                }
            }
        }

        System.out.println("+---------------------+-----------+-----------+-----------+-----------+-----------+");
        System.out.println("| SHAPE_NAME          | BORDER    | BD_COLOR  | BG_COLOR  | PERIMETER | AREA      |");
        System.out.println("+---------------------+-----------+-----------+-----------+-----------+-----------+");
        for (Shape shape : box) {
            shape.draw();
        }
        System.out.println("+---------------------+-----------+-----------+-----------+-----------+-----------+");
    }
}
