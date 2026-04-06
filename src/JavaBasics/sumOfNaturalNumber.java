package JavaBasics;

import java.util.Scanner;

public class sumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        int result=n*(n+1)/2;
        System.out.println(result);
    }
}
