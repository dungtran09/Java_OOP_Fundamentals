package com.java.basicarray;

import java.util.Arrays;

public class ReverseArr {
  public static void main(String[] args) {
    int[] arrList = {1, 3, 23, 9, 18};
    System.out.println(Arrays.toString((arrList)));
    reverseArr(arrList);
    System.out.println(Arrays.toString(arrList));
  }

  public static void reverseArr(int[] arr) {
    int start = 0;
    int end = arr.length - 1;

    while (start < end) {
      swap(arr, start, end);
      start++;
      end--;
    }
  }

  public static void swap(int[] arr, int firstNumber, int secondNumber) {
    int temp = arr[firstNumber];
    arr[firstNumber] = arr[secondNumber];
    arr[secondNumber] = temp;
  }
}
