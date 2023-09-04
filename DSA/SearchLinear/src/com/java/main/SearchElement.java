package com.java.main;

public class SearchElement {
    public static void main(String[] args) {
        int[] listNum = {2, 3, 5, 8, 14, 16, 18};
        int result = searchElement(listNum, 18) ;
        
        System.out.println(result);
    }

    public static int searchElement(int[] listNum, int target) {
        int start = 0;
        int end = listNum.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (listNum[mid] == target) {
                return mid;
            } else if (target > listNum[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
