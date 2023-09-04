package com.dungtran.recursion.data;
 
public class ReverseNumber {
    public static void main(String[] args) {
        reverseNumber(1234); 
        System.out.print("\n");
    }

    public static void reverseNumber(int num) {
        if (num == 0) {
            return;
        }
        int remd = num % 10;
        System.out.print(remd);
        reverseNumber(num / 10);
    }
}
