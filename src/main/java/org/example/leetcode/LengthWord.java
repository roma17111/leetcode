package org.example.leetcode;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class LengthWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("Привет мир "));
        JOptionPane.showMessageDialog(null,"Hello");
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int result = s.lastIndexOf(" ")+1;
        return s.length() - result;
    }
}
