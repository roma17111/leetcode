package org.example.leetcode;

import java.util.HashMap;
import java.util.Map;

public class AmorphStrings {
    public static void main(String[] args) {
       // isIsomorphic("a", "a");
        int a = 'r';
        System.out.println(a);

    }


    public static boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            System.out.println(false);
            return false;
        }
        int[] arr_s = new int[128];
        int[] arr_t = new int[128];
        for (int i = 0; i < s.length(); i++) {
            char ch_s = s.charAt(i);
            char ch_t = t.charAt(i);
            if (arr_s[ch_s] == 0) {
                arr_s[ch_s] = ch_t;
            }
            if (arr_t[ch_t] == 0) {
                arr_t[ch_t] = ch_s;
            }
            if (arr_s[ch_s] != ch_t || arr_t[ch_t] != ch_s) {
                System.out.println(false);
                return false;
            }
        }
        System.out.println(true);
        return true;
    }
}

