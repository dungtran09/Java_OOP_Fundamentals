package com.java.main;

import java.util.Arrays;

public class Search {
    public static void main(String[] args) {
        int[] listNumber = {1, 5, 75, 32, 66, 43};
        int key = 67;

        int result = search(listNumber, key);
        System.out.println(result);

    }

    public static int search(int[] listNumber, int key) {
        if (listNumber.length == 0) {
            return -1;
        }

        for (int index = 0; index < listNumber.length; index++) {
            if (key == listNumber[index]) {
                return index;
            }
        }
        return Integer.MAX_VALUE;
    }
}
