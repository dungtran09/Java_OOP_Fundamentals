package com.java.bst.main;

public class Ceiling {
    public static void main(String[] args) {
        int[] list = {2, 3, 5, 9, 14, 16, 18};
        int target= 19;
        int result = ceilling(list, target);
        System.out.println(result);
    }

    public static int ceilling(int list[], int target) {
        int start = 0;
        int end = list.length - 1;

        if (target > list[end]) {
            return -1;
        }

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
        return start; 
    }
}
