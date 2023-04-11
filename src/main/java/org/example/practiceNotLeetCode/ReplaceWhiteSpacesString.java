package org.example.practiceNotLeetCode;

public class ReplaceWhiteSpacesString {
    public static void main(String[] args) {
        System.out.println(deleteWhiteSpaces("text test java"));
    }

    public static String deleteWhiteSpaces(String text) {
        return text.replace(" ", "");
    }
}
