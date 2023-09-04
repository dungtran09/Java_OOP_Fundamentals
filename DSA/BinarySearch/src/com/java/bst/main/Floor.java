package com.java.bst.main;

import java.util.Arrays;

public class Floor {
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 9, 14, 16, 18};
        int target= 1;
        int result = floor(list, target);
        System.out.println(Arrays.toString(list));
        System.out.println(result);
    }

    public static int floor(int list[], int target) {
        int start = 0;
        int end = list.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;

            if (target == list[middle]) {
                return middle;
            } else if (target < list[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return end; 
    }
}
