package com.java.tacobox.data;

public class CustomTacoBox implements TacoBoxs {
  
    private int tacos;
    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
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
