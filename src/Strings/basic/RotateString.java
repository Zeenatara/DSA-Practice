package Strings.basic;

import java.util.*;

public class RotateString {

    public static boolean rotateString(String s, String goal) {

        if (s.length() != goal.length()) {
            return false;
        }

        String doubled = s + s;

        return doubled.contains(goal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter original string: ");
        String s = sc.nextLine();

        System.out.print("Enter goal string: ");
        String goal = sc.nextLine();

        boolean result = rotateString(s, goal);

        System.out.println("Can original string be rotated to goal string? " + result);
    }
}