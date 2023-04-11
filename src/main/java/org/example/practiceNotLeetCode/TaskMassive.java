package org.example.practiceNotLeetCode;

import java.util.Arrays;

public class TaskMassive {
    public static void main(String[] args) {
        int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
        System.out.println(Arrays.toString(n));
        System.out.println(Arrays.toString(getFixMassive(n)));
    }

    public static int[] getFixMassive(int... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                numbers[i] +=1;
            }
        }
        return Arrays.copyOfRange(numbers, 3, 7);
    }
}
