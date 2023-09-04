package com.java.main;

import java.util.Arrays;

public class TwoDimensinalArray {
  public static void main(String[] args) {
    int[][] board = new int[3][3];

    for (int row = 0; row < board.length; row++) {
      for (int col = 0; col < board[row].length; col++) {
        board[row][col] = row + col;
      }
    }
    
    // print by first method
    for (int[] row : board) {
      for (int val : row ) {
        System.out.print(val + "\t");
      }
    }
    System.out.print("]\n");
    // print by second method
    System.out.println(Arrays.deepToString(board));
  }
}
