package com.dungtran.samurai;

import java.util.Scanner;

public class Samurai {
    public static void main(String[] args) {
        inputProfile();    
    }

    public static void inputProfile() {
        String name, address;
        int yob = 0;
        Scanner sc = new Scanner(System.in);
         
        System.out.print("Enter your name: ");
        name = sc.nextLine().toUpperCase();
        
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Enter your of birth: ");
                // yob = sc.nextInt();
                yob = Integer.parseInt(sc.nextLine());
                flag = false;
            } catch (NumberFormatException e) {
                System.out.println("  ERROR: Opss! The number format is not valid! Please try again...");
            }
        }
    
        // yob = sc.nextInt();
        // sc.nextLine();    
        System.out.print("Enter your address: ");
        address = sc.nextLine().toUpperCase();
        
        System.out.println("\nYOUR PROFILE: ");

        System.out.println("\tName: " + name);
        System.out.println("\tYour Of Birth: " + yob);
        System.out.println("\tYour address: " + address);
        sc.close();
    }
}
