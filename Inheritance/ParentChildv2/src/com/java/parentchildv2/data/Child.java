package com.java.parentchild.data;

public class Child extends Parent {
   
    private String assetThree;

    public Child (String assetOne, String assetTwo, String assetThree) {
        super(assetOne, assetTwo);
        this.assetThree = assetThree;
    }

    public String getAssetThree() {
       return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }
   
    public String sayWithMySelf () {
        return  "NERVER STOP LEARNING and be HUMBLE"; 
    }

    @Override
    public void showProfile() {
        System.out.print("Child: \n\t[\n\t\t{ " + "assetOne    = " + '"' + assetOne + '"' + " }, \n\t\t{ assetTwo    = " + '"' +
            assetTwo + '"' + " },  \n\t\t{ assetThree  = " + '"' + assetThree + '"' + " }, \n\t\t{ SOLOGAN     = " + '"' + sayWithMySelf() + '"' + " }, \n\t]\n");
    }
}
