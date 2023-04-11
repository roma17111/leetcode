package org.example.leetcode;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        twoSum(new int[]{ 2, 7, 11, 15}, 9);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> result =new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (result.containsKey(target - nums[i])) {
                System.out.println(result.get(target-nums[i])+" "+i);
                return new int[]{result.get(target - nums[i]), i};
            }
            result.put(nums[i],i);
        }
        return new int[0];
    }
}

