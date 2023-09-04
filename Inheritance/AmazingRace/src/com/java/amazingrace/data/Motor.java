package com.java.amazingrace.data;

import java.util.Random;

public class Motor implements DeathRacer {
    private String model;
    private String manufacturer;
    private double weight;
    private double speed;

    private final double MAX_SPEED = 150;

    public Motor (String model, String manufacturer, double weight) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.speed = 0;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getWeight() {
        return weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getSpeed() {
        return speed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void run() {
        Random rd = new Random();
        double result = rd.nextDouble() * MAX_SPEED;
        this.speed = result;
    }

    public void showRecord() {
        System.out.printf("| %-10s| %-10s| %-10s| %-10.2f| %-10.2f|\n", model, manufacturer, "null" , weight, getSpeed());
    }

    @Override 
    public double runToDead() {
        run();
        return getSpeed() * 5;
    }

    @Override
    public void showHowToDead() {
        System.out.printf("| %-10s| %-10s| %-10.2f| %-10.2f|\n", model, manufacturer, weight, runToDead());
    }
}
