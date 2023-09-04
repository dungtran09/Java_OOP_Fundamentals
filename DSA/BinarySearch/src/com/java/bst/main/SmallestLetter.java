package com.java.bst.main;

/**
 * SmallestLetter
 */
public class SmallestLetter {

    public static void main(String[] args) {
        char[] letters = {'a', 'b', 'e', 'h', 'k'};

        char result = nextGrestestLetter(letters, 'e');
        System.out.println(result);
    }
    
    public static char nextGrestestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int middle = start + (end - start) / 2;
            if (target < letters[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        return letters[start % letters.length];
    }

}
