package com.dungtran.sort.main;

import com.dungtran.sort.data.BubbleSort;

/**
 * BubSortApp
 */
public class BubSortApp {

    public static void main(String[] args) {
        int max = 100;
        BubbleSort arr = new BubbleSort(max);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33); // insert 10 items
        
        arr.display(); // display items
        arr.sort(); // insertion-sort them
        arr.display();
    }
}
