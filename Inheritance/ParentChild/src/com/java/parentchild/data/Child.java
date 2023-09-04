package com.java.parentchild.data;

public class Child extends Parent {
    
    public Child (String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    
    @Override
    public void showProfile() {
        System.out.print("Child: \n\t[\n\t\t{ " + "assetOne  = '" + assetOne + "' }, \n\t\t{ assetTwo  = '" + assetTwo + "' },\n\t]\n");
    }
}
