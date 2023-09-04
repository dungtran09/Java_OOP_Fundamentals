package com.java.sort.main;

import com.java.sort.data.ArrIns;

/**
 * InsSortApp
 */
public class InsSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ArrIns arr = new ArrIns(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        System.out.println("Before Sort: ");
        arr.display();

        arr.sort();
        System.out.println("After Sort: ");
        arr.display();
    }
}
