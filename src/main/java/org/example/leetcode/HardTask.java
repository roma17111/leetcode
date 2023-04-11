package org.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HardTask {
    public static void main(String[] args) {
        isSubsequence("b","abc");
    }

    public static boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            System.out.println(true);
            return true;
        }
        if (s == null || t == null) {
            System.out.println(false);
            return false;
        }
        if (s == null && t == null) {
            return true;
        }
        List<Character> char_t = new ArrayList<>();
        for (char c : t.toCharArray()) {
            char_t.add(c);
        }
        char[] char_s = s.toCharArray();
        int result = 0;
        for (int i = 0; i < char_t.size(); i++) {
            if (char_s[result] == char_t.get(i)) {
                result++;
                if (result == s.length()) {
                    break;
                }
            }
        }
        if (result != s.length()) {
            System.out.println(false);
            return false;
        }
        System.out.println(true);
        return true;
    }
}
