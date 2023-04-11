package org.example.practiceNotLeetCode;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 1);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue().hashCode());
        }
    }
}
