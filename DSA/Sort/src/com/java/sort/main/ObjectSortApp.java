package com.java.sort.main;

import com.java.sort.data.ArrInObject;

/**
 * ObjectSortApp
 */
public class ObjectSortApp {

    public static void main(String[] args) {
        int maxSize = 100;
        ArrInObject arr = new ArrInObject(maxSize);
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Doc", 59);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Smith", "Paul", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29);
        arr.insert("Velasquez", "Jose", 72);
        arr.insert("Vang", "Minh", 22);
        arr.insert("Creswell", "Lucinda", 18);

        System.out.println("Before Sorting: ");
        arr.display();
        System.out.println("After Sorting: ");
        arr.sort();
        arr.display();
    }
}
