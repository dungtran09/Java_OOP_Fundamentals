package com.dungtran.main;

import com.dungtran.util.Mytoys;

public class Stage {
    public static void main(String[] args) {
        System.out.println("PI: " + Mytoys.PI); 

        int n;
        n = Mytoys.getAnInteger();
        System.out.println("YOUR NUMBER INTEGER: " + n);

        double d;
        d = Mytoys.getAnDouble();
        System.out.println("YOUR NUMBER DOUBLE: " + d);
        
    }
}
