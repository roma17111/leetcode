package org.example.leetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HayStack {
    public static void main(String[] args) {
        strStr("missadssss","sad");
    }

    public static int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) {
            return -1;
        }
        for (int i = 0; i < haystack.length(); i++) {
            String s = haystack.substring(i, i+needle.length());
            if (s.equals(needle)) {
                System.out.println(i);
                return i;
            }
        }
        return -1;
    }
}
