package com.java.amazingrace.main;

import java.util.Random;

import com.java.amazingrace.data.Cat;
import com.java.amazingrace.data.DeathRacer;
import com.java.amazingrace.data.Dog;
import com.java.amazingrace.data.Hamter;
import com.java.amazingrace.data.Motor;
import com.java.amazingrace.data.Pet;

public class App {
    public static void main(String[] args) {
       // amazingRace(); 
       runToDead();
    }
    
    public static void runToDead() {
       
        DeathRacer[] racers = new DeathRacer[] {
            new Motor("KAZA" ,"Z-1000", 200),
            new Motor("YA" ,"EXCITER", 145),
            new Dog(1002, "Dog", 2002, 10.0),
            new Hamter(1007, "Hamter", 2002, 20.0),
            new Cat(1001, "Cat", 2001, 3.50),
            new DeathRacer() {
                private static final double MAX_SPEED = 50;
                private double speed = 0;
                
                public double getSpeed() {
                    return speed;
                }

                public void run() {
                    Random rd = new Random();
                    double result = rd.nextDouble() * MAX_SPEED;
                    this.speed = result;
                }

                @Override
                public double runToDead() {
                    run();
                    return getSpeed() * 20;
                }
                
                @Override
                public void showHowToDead() {
                    System.out.printf("| %-10s| %-10s| %-10s| %-10.2f|\n", "null", "UFO", "null", runToDead());
                }
            },
        };
        
        System.out.println("RUN TO DEAD: ");
        System.out.println("+-----------+-----------+-----------+-----------+");
        System.out.println("| ID        | NAME      | WEIGHT    | SPEED     |");
        System.out.println("+-----------+-----------+-----------+-----------+");
        for (DeathRacer racer : racers) {
            racer.runToDead();
            racer.showHowToDead();
        }
        System.out.println("+-----------+-----------+-----------+-----------+");

    }
    
    public static void amazingRace() {
        Pet[] listPets = new Pet[] {
            new Cat(1001, "Cat", 2001, 3.5),
            new Dog(1002, "Dog", 2002, 6.5),
            new Hamter(1004, "Hamter", 2003, 7.4),
        };
       
         

        System.out.println("RECORD: ");
        System.out.println("+-----------+-----------+-----------+-----------+-----------+");
        System.out.println("| ID        | NAME      | YOB       | WEIGHT    | SPEED     |");
        System.out.println("+-----------+-----------+-----------+-----------+-----------+");
        for (Pet pet : listPets) {
            pet.run();
            pet.showRecord();
        }
        System.out.println("+-----------+-----------+-----------+-----------+-----------+");

        System.out.println("TOP BXH : ");
        for (int i = 0; i < listPets.length - 1; i++) {
            for (int j  = i + 1; j < listPets.length; j++) {
                if (listPets[i].getSpeed() < listPets[j].getSpeed()) {
                    Pet temp = listPets[i];
                    listPets[i] = listPets[j];
                    listPets[j] = temp;
                }
            }
        }

        // print after sort
        System.out.println("+-----------+-----------+-----------+-----------+-----------+");
        System.out.println("| ID        | NAME      | YOB       | WEIGHT    | SPEED     |");
        System.out.println("+-----------+-----------+-----------+-----------+-----------+");
        for (Pet pet : listPets) {
            pet.showRecord();
        }
        System.out.println("+-----------+-----------+-----------+-----------+-----------+");
    }
}
