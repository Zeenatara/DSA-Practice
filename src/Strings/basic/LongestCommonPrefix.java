package Strings.basic;

import java.util.*;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String first = strs[0];

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for (int j = 1; j < strs.length; j++) {

                if (i >= strs[j].length() || strs[j].charAt(i) != ch) {

                    return first.substring(0, i);
                }
            }
        }

        return first;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter string " + (i + 1) + ": ");
            strs[i] = sc.nextLine();
        }

        String result = longestCommonPrefix(strs);

        System.out.println("Longest Common Prefix is: " + result);
    }
}