package com.java.amazingrace.data;

public abstract class Pet implements DeathRacer {
    protected int id;
    protected String name;
    protected int yob;
    protected double weight;
    protected double speed;
    
    public Pet(int id, String name, int yob, double weight) {
        this.id = id;
        this.name = name;
        this.yob = yob;
        this.weight = weight;
        this.speed = 0;
    }

    public int getId() {
       return id;
    }

    public String getName() {
       return name;
    }

    public int getYob() {
        return yob;
    }

    public double getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    } 

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public abstract void run();
    public abstract void showRecord(); 
}
