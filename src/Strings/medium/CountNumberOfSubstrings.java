package Strings.medium;

import java.util.Scanner;

public class CountNumberOfSubstrings {

    public static int numberOfSubstrings(String s) {

        int[] last = {-1, -1, -1};

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            last[s.charAt(i) - 'a'] = i;

            int minIndex = Math.min(last[0],
                    Math.min(last[1], last[2]));

            if (minIndex != -1) {
                count += minIndex + 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string containing only a, b, and c: ");

        String s = sc.nextLine();

        int result = numberOfSubstrings(s);

        System.out.println("Total number of valid substrings: " + result);

        sc.close();
    }
}