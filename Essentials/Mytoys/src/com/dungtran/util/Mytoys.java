package com.dungtran.util;

import java.util.Scanner;

public class Mytoys {
    public static final double PI = 3.1415;
    private static Scanner scanner = new Scanner(System.in);

    public static int getAnInteger() {
        int n;
        
        do {
            try {
                System.out.print("ENTER AN INTEGER: ");
                n = Integer.parseInt(scanner.nextLine());
                // break if the number is format valid
                break;
            } catch (NumberFormatException e) {
                System.out.println("  ERROR: Oops! The number format is not valid!\n     Please try again!");
            }
        } while (true);
        return n;
    }

    public static double getAnDouble() {
        double d;
        do {
            try {
                System.out.print("ENTER AN DOUBLE: ");
                d = Double.parseDouble(scanner.nextLine());
                // break if the number is format valid
                break;
            } catch (NumberFormatException e) {
                System.out.println("  ERROR: Oops! The number format is not valid!\n     Please try again!");
            }
        } while (true);
        scanner.close();
        return d;
    }
}
