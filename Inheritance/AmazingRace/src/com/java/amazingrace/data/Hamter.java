package com.java.amazingrace.data;

import java.util.Random;

public class Hamter extends Pet {
    private static final double MAX_SPEED = 10;

    public Hamter(int id, String name, int yob, double weight) {
        super(id, name, yob, weight);
    }

    @Override
    public void run() {
        Random rd = new Random();
        double result = rd.nextDouble() * MAX_SPEED;
        setSpeed(result);
    }

    @Override
    public void showRecord() {
        System.out.printf("| %-10d| %-10s| %-10d| %-10.2f| %-10.2f|\n", id, name, yob, weight, getSpeed());
    }

    @Override
    public double runToDead() {
        run();
        return getSpeed() * 20;
    }
    
    @Override
    public void showHowToDead() {
        System.out.printf("| %-10d| %-10s| %-10.2f| %-10.2f|\n", id, name, weight, runToDead());
    }
}
