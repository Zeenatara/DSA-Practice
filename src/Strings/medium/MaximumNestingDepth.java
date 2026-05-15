package Strings.medium;

import java.util.Scanner;

public class MaximumNestingDepth {

    public static int maxDepth(String s) {

        int currentDepth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {

            // Opening bracket
            if (ch == '(') {

                currentDepth++;

                maxDepth = Math.max(maxDepth, currentDepth);
            }

            // Closing bracket
            else if (ch == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int result = maxDepth(s);

        System.out.println("Maximum Nesting Depth: " + result);

        sc.close();
    }
}