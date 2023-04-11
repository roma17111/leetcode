package org.example.practiceNotLeetCode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class StringLetters {
    public static void main(String[] args) {
        String s = "мама папа дядя 121212 клава комп";
        System.out.println("Строка - " + s + "\n Слова");
        countWords(s).entrySet().forEach(System.out::println);
    }

    public static Map<Integer,String> countWords(String s) {
        Map<Integer, String> map = new LinkedHashMap<>();
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                st.append(s.charAt(i));
            }
        }
        StringTokenizer words = new StringTokenizer(String.valueOf(st));
        int count = 1;
        while (words.hasMoreTokens()) {
            map.put(count, words.nextToken());
            count++;
        }
        return map;
    }
}
