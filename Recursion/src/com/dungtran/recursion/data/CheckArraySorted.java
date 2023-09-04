package com.dungtran.recursion.data;

public class CheckArraySorted {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9, 10};
        System.out.println(isSorted(nums, 0));
    }

    public static boolean isSorted(int[] nums, int index) {
        System.out.println(nums);
        if (index == nums.length - 1) {
            return true;
        }
        return (nums[index] < nums[index + 1]) && (isSorted(nums, index + 1));
    }
}
