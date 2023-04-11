package org.example.practiceNotLeetCode;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        long[] i = getArrayFibonacci(50);
        for (int i1 = 0; i1 < i.length; i1++) {
            System.out.println(i[i1]);
        }
    }

    public static long[] getArrayFibonacci(int length) {
        if (length > 50) {
            throw new IllegalArgumentException("Incorrect length");
        }
        long[] arrays = new long[length];
        for (int i = 0; i < arrays.length; i++) {
            if (i == 0) {
                arrays[i] = 0;
            } else if (i == 1) {
                arrays[i] = 1;
            } else {
                arrays[i] = arrays[i-1]+arrays[i-2];
            }
        }
        return arrays;
    }
}
