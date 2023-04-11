package org.example.leetcode;

public class MainPalindrome {
    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {
        if(s.isEmpty()){
            return true;
        }
        s = s.toLowerCase();
            s = s.replaceAll("[^a-zA-Z0-9]","");

        int a = 0;
        int b = s.length()-1;
        while(a<b){
            if(s.charAt(a)!=s.charAt(b)){
                System.out.println(false);
                return false;
            }
            a++;
            b--;
        }
        System.out.println(true);
        return true;
    }
}

