package com.dungtran.recursion.data;

public class Patterns {
    public static void main(String[] args) {
        patternTriangle(5);
    }

    public static void patternTriangle(int col) {
        if (col == 0) {
            return;
        }
        for (int i = 1; i <= col ;i++) {
            System.out.print("*");
        }
        System.out.print("\n");
        patternTriangle(col - 1);
    }
}
