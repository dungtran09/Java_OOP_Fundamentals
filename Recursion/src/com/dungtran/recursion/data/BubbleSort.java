package com.dungtran.recursion.data;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {3, 2, 8, 4, 6, 6, 1, 0};
        sort(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int index) {
        if (index >= arr.length - 1) {
            return;
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        sort(arr, index + 1);
    }
}
