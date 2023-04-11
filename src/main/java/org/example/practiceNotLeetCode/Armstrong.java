package org.example.practiceNotLeetCode;

import java.util.StringTokenizer;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(isNumberArmstrong(153));
    }

    public static boolean isNumberArmstrong(int number) {
        String result = "" + number;
        int res = 0;
        for (int i = 0; i < result.length(); i++) {
            int a = Integer.parseInt(String.valueOf(result.charAt(i)));
            res = (int)(res + Math.pow(a, 3));
        }

        if (res != number) {
            return false;
        }
        return true;
    }
}
