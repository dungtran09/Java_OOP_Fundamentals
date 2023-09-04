package com.java.bst.main;

public class BinarySearch {
    public static void main(String[] args) {
        int[] list = {3, 5, 6, 8, 9, 23, 56, 78, 90};
        int target= 78;
        int result = binarySearch(list, target);
        System.out.println(result);
    }

    public static int binarySearch(int[] list, int target) {
        int start = 0;
        int end = list.length - 1;

        if (list.length == 0) {
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == list[mid]) {
                return mid;
            }
            if (target > list[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
