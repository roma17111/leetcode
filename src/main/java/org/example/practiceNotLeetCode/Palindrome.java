package org.example.practiceNotLeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome("an");
    }

    public static boolean isPalindrome(String text) {
        List<Character> characters = new ArrayList<>();
        for (char c : text.toCharArray()) {
            characters.add(c);
        }
        ListIterator<Character> iterator = characters.listIterator();
        ListIterator<Character> reverse = characters.listIterator(characters.size());
        while (iterator.hasNext() && reverse.hasPrevious()) {
            if (iterator.next() != reverse.previous()) {
                System.out.println("Не палиндром");
                return false;
            }
        }
        System.out.println("Палиндром");
        return true;
    }
}
