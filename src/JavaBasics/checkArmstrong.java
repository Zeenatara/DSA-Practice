package JavaBasics;

import java.util.Scanner;

public class checkArmstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        int temp = n;
        int sum = 0;
        int digit = String.valueOf(n).length();

        while (n > 0) {
            int digits = n % 10;
            sum += (int) Math.pow(digits, digit); // cast to int
            n /= 10;
        }

        if (sum == temp) {
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is NOT an Armstrong number");
        }

        sc.close();
    }
}