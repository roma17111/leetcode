package org.example.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

public class TaskArrayPlusOne {
    public static void main(String[] args) {
        int[] a = new int[]{9,8,9};
        plusOne(a);
    }
    public static int[] plusOne(int[] digits) {
        int a = digits.length - 1;
        while (digits[a] == 9) {
            digits[a] = 0;
            a--;
            if (a < 0) {
                digits = new int[digits.length + 1];
                digits[0] = 1;
                break;
            }
        }
        if (a>=0) {
            digits[a]=digits[a]+1;
        }
        System.out.println(Arrays.toString(digits));
        return digits;
    }
}

