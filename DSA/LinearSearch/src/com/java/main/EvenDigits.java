package com.java.main;

import java.util.Arrays;

public class EvenDigits {
  public static void main(String[] args) {
    int[] listNum = {555,901,482,1771};
    System.out.println("Even number of digits: " + numberOfDigits(listNum));
  }

  public static int numberOfDigits(int[] listNum) {
    int count = 0;
    for (int i = 0; i < listNum.length; i++) {
      String[] listStrNum = new String[1];
      listStrNum[0] = String.valueOf(listNum[i]);
      if ((listStrNum[0].length() / 2) == 0) {
        count++;
      }
    }
    return count;
  } 
}
