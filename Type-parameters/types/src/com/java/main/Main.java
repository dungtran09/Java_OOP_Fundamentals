package com.java.main;

import java.util.Random;

import com.java.data.HashMapFake;
import com.java.data.List;
import com.java.data.Locker;
import com.java.data.Pair;

public class Main {
    public static void main(String[] args) {
        
        // type string
        // Locker<String> str = new Locker<>();
        // str.setValue(":)");
    
        // type integer
        // Locker<Integer> integer = new Locker<>();
        // integer.setValue(50);

        // type random
        // Locker<Random> random = new Locker<>();
        // random.setValue(new Random());
        
        // System.out.println(str.getValue());
        // System.out.println(integer.getValue());
        // System.out.printf("%4.2f\n", random.getValue().nextDouble());
        
        // int[] numbers = {3, -1, 8, 4};
        // System.out.println(sum(numbers, 0, 0, 0, 0));
        // System.out.println(sum(numbers, 0, 0, 0, 10));
        // System.out.println(sum(numbers, 0, 1, 0, 10));
        // System.out.println(sum(numbers, 0, 1, -10, 10));
        // System.out.println(sum(numbers, -1, 999, -10, 10));

        // List<String> myList = new List<>();
        // myList.add("hello");
        // myList.add("world");
        // myList.add("My ");
        // myList.add("Name ");
        // myList.add("DungXT ");
        //
        // for(int i = 0; i < myList.size(); i++) {
        //     System.out.println(myList.value(i));
        // }
        //

        Pair<String, Integer> pair = new Pair<>("One", 1);

        System.out.println(pair.getKey() + " - " + pair.getValue());
    }
    
    public static int sum(int[] arr, int fromWhere, int toWhere, int smallest, int largest) {
        int total = 0;
        if (fromWhere < 0) fromWhere = 0;
        if (toWhere > arr.length) toWhere = arr.length;

        for (int i = fromWhere; i < toWhere; i++) {
            if ((arr[i] <= largest) && (arr[i] >= smallest)) {
                total += arr[i];
            }
        }
        return total;
    }

}
