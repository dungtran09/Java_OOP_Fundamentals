package com.java.searchrange.main;

import java.util.Arrays;

public class SearchRange {
    public static void main(String[] args) {
    
        int[] listNums = {5, 7, 7, 8, 8, 10};
        
        int[] res = searchRange(listNums, 8);
            
        System.out.println(Arrays.toString(res));

    }
    
    public static int[] searchRange(int[] listNums, int target) {
        int[] result = {-1, -1};

        result[0]= search(listNums, target, true);
        
        if (result[0] != -1) {
            result[1]= search(listNums, target, false);
        }
        return result;
    }

    public static int search(int[] listNums, int target, boolean findStartIndex) {
        int res = -1;
        int start = 0;
        int end = listNums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target > listNums[mid]) {
                start = mid + 1;
            } else if (target < listNums[mid]) {
                end = mid - 1;
            } else {
                res = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return res;
    }


}
