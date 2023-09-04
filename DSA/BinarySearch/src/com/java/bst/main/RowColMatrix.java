package com.java.bst.main;

import java.util.Arrays;

/**
 * RowColMatrix
 */
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] nums = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29, 37, 49},
            {33, 34, 28, 50},
        };

        System.out.println(Arrays.toString(search(nums, 37)));
    }

    public static int[] search(int[][] nums, int tartget) {
        int row = 0;
        int col = nums.length - 1;

        while ((row < nums.length) && col >= 0) {
            
            if (nums[row][col] == tartget) {
                return new int[]{row, col};
            } else if (nums[row][col] < tartget) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
