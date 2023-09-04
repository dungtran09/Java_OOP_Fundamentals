package com.java.parentchild.data;

public class Parent {
    protected String assetOne;
    protected String assetTwo;


    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public String getAssetOne() {
        return assetOne;
    }

    public String getAssetTwo() {
       return assetTwo;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void showProfile() {
        System.out.print("Parent: \n\t[\n\t\t{ " + "assetOne  = '" + assetOne + "' }, \n\t\t{ assetTwo  = '" + assetTwo + "' },\n\t]\n");
    }
}
