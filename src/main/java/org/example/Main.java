package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        pivotIndex(new int[]{2,2,1,2,2});

    }

    public static int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < result.length; i++) {
            sum += nums[i];
            result[i] = sum;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }

    public static int pivotIndex(int[] nums) {
        int sum1 = 0;
        int sum = 0;
        for (int num : nums) {
            sum = sum + num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (sum - nums[i] - sum1== sum1) {
                System.out.println(i);
                return i;
            }
            sum1 += nums[i];
        }
        return -1;
    }
}
