package org.example.practiceNotLeetCode;

import java.util.Arrays;

public class MaxMassive {
    public static void main(String[] args) {
        int a = getMaxSecondNumberFromArray(12,1,213231,4,5,6,7,8,9);
        System.out.println(a);
    }

    public static int getMaxSecondNumberFromArray(int... numbers) {
        Arrays.sort(numbers);
        return numbers[numbers.length - 2];
    }
}
