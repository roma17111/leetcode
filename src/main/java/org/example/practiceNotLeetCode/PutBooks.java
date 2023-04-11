package org.example.practiceNotLeetCode;

import java.util.*;
import java.util.stream.Collectors;

public class PutBooks {
    public static final double SHELF = 5.0;
    public static void main(String[] args) {
        getShelfOfBooks(List.of("Кафка",
                "Евгений Онегин",
                "Морской волк",
                "Апокалипсис",
                "Властелин колец",
                "Тест",
                "В списках не значился",
                "О зори здесь тихие",
                "Хроники нарнии",
                "Философия Java"));
    }

    public static void getShelfOfBooks(List<String> books) {
       List<String> strings =  books
               .stream()
               .sorted(String::compareTo)
               .collect(Collectors.toList());
        Map<String, Integer> map = new LinkedHashMap<>();
        if (books.size() <= 5) {
            for (int i = 0; i < strings.size(); i++) {
                map.put(strings.get(i), i+1);
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("Полка - " + entry.getValue() + ". Книга - " + entry.getKey());
            }
        } else {
            double shelfSize = (double)strings.size() / SHELF;
            for (int i = 0; i < books.size(); i++) {
                map.put(strings.get(i), (int) Math.floor(i / shelfSize+1));
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println("Полка - " + entry.getValue() + ". Книга - " + entry.getKey());
            }
        }
    }
}
