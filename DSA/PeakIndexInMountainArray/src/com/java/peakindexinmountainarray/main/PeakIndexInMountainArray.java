package com.java.peakindexinmountainarray.main;

/**
 * PeakIndexInMountainArray
 */

public class PeakIndexInMountainArray {

    public static void main(String[] args) {
        
        int[] listNums = {1, 2, 3 ,5, 7, 9, 10 ,50 , 17, 16, 12};
        System.out.println(peakIndexInMountainArray(listNums));
    }
    
    public static int peakIndexInMountainArray(int[] listNums) {
        int start = 0;
        int end = listNums.length - 1;
        int middle = start + (end - start) / 2;
        int result = -1;
        while ((listNums[middle] < listNums[middle - 1]) || (listNums[middle] < listNums[middle + 1])) {
            if (listNums[middle] > listNums[middle + 1]) {
                end = middle;
            } else if (listNums[middle] < listNums[middle + 1]) {
                start = middle + 1;
            } else {
                result = middle;
            }
            middle = start + (end - start) / 2;
        }
          
        return middle;
    }
}
