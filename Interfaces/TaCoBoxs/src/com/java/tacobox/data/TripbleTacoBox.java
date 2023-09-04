package com.java.tacobox.data;

public class TripbleTacoBox implements TacoBoxs {
    private int tacos;

    public TripbleTacoBox() {
        this.tacos = 3;
    }

    @Override
    public int tacoRemaining() {
        return this.tacos;
    }    

    @Override
    public void eat() {
        if (tacos >= 1) this.tacos -= 1;
    }
}
