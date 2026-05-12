package Strings.basic;

import java.util.*;

public class ReverseWords {

    public static String reverseWords(String s) {

        s = s.trim();

        String[] words = s.split("\\s+");

        StringBuilder ans = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {

            ans.append(words[i]);

            if (i != 0) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        System.out.println(reverseWords(s));
    }
}