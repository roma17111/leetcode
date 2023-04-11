package org.example.practiceNotLeetCode;

import java.util.Arrays;
import java.util.Comparator;

public class Anagram {
    public static void main(String[] args) {
        isAnagram("anagramm", "nagaramm");
    }

    public static boolean isAnagram(String s,String t) {
        if (s.length() != t.length()) {
            System.out.println(false);
            return false;
        }
        int[] a = new int[s.length()];
        int[] b = new int[t.length()];
        for (int i = 0; i < a.length; i++) {
            a[i] += s.charAt(i);
            b[i] += t.charAt(i);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        if (!Arrays.equals(a, b)) {
            return false;
        }
        return true;
    }
}
