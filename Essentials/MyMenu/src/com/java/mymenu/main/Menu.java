package com.java.mymenu.main;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        // User choise
        int choise;

        // Menu data
        int options[] = {1, 2, 3, 4, 5};
        String menuItems[] = {"Americano", "Latte", "Espresso", "Cappuccino", "Exit"};

        // Exit option
        int EXIT = options[options.length - 1];

        // Display menu
        displayMenu(options, menuItems);

        // Setup Scanner
        Scanner in = new Scanner(System.in);
        choise = in.nextInt();

        // Menu loop
        while (choise != EXIT) {
            // Check choise value
            if (choise == options[0]) {
                System.out.println(menuItems[0] + " coffee!");
            } else if (choise == options[1]) {
                System.out.println(menuItems[1] + " coffee!");
            } else if (choise == options[2]) {
                System.out.println(menuItems[2] + " coffee!");
            } else if (choise == options[3]) {
                System.out.println(menuItems[3] + " coffee!");
            }
            // Display menu
            displayMenu(options, menuItems);

            // Get choise
            choise = in.nextInt();
        }
        System.out.println("Good bye! See you again.");
    }

    public static void displayMenu(int opts[], String menuItems[]) {
        System.out.println("M E N U");
        System.out.println("==================");
        for (int i = 0; i < opts.length; i++) {
            System.out.printf("%d. %s\n", opts[i], menuItems[i]);
        }
        System.out.println("==================");
        System.out.print("What acction do you choise?: ");
    }
}
