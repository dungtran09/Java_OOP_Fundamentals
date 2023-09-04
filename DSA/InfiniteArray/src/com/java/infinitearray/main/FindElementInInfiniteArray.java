package com.java.infinitearray.main;

public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int[] listNums = {3, 5, 7, 9, 10, 90, 100, 130, 160, 170, 200, 250, 260, 270, 300, 350, 420, 650, 780, 990, 999};

        int result = findElementInFiniteArray(listNums, 170); 
        System.out.println(result);
    }

    public static int findElementInFiniteArray(int[] listNums, int target) {
        int start = 0;
        int end = 1;
        
        while (target > listNums[end]) {
            int temp = end + 1;
            end = end + (end - start + 1) * 2;
            start = temp;
        }

        return binarySearch(listNums, target, start, end);
    }

    public static int binarySearch(int[] listNums, int target, int start, int end) {
        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target == listNums[middle]) {
                return middle;
            } else if (target < listNums[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return -1;
    }


}
