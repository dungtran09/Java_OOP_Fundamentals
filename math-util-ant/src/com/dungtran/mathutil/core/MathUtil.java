package com.dungtran.mathutil.core;

public class MathUtil {

    public static long getFactorial(int n) {
        if (n < 0 || n >= 20) {
            throw new IllegalArgumentException("The argument is not valid!");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        int product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }
}
