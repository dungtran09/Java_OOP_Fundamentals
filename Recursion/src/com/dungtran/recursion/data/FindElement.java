package com.dungtran.recursion.data;

import java.util.Arrays;

public class FindElement {
    public static void main(String[] args) {
                    
        int[] nums = {3, 6, 8, 9, 23, 54, 2, 9 ,13};
        System.out.println(checkElement(nums, 12, 0));
        int[] rs = findElement(nums, 9, 0, new int[nums.length], 0);

        System.out.println(Arrays.toString(rs));

    }

    public static boolean checkElement(int[] nums, int target, int index) {
        if (index == nums.length) {
            return false;
        }
        return (target == nums[index] || checkElement(nums, target, index + 1));
    }

    public static int[] findElement(int[] nums, int target, int index_nums, int[] rs, int index_rs) {
        if (index_nums == nums.length) {
            return rs;
        }

        if (target == nums[index_nums]) {
            rs[index_rs] = index_nums;
            index_rs += 1;
        }

        return findElement(nums, target, index_nums + 1, rs, index_rs + 1);
    }

}
