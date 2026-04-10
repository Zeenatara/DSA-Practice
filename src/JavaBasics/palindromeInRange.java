package JavaBasics;

import java.util.Scanner;

public class palindromeInRange {

    static boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n != 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }

        return reversed == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                System.out.print(" " + i);
            }
        }

        sc.close();
    }
}