package JavaBasics;

import java.util.Scanner;

public class calculatePower {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for base");
        int base = sc.nextInt();
        System.out.println("Enter number for exponent");
        int exponent = sc.nextInt();

        long result=1;

        for (int i = 0; i < exponent; i++) {
            result*=base;
        }
        System.out.println(result);
    }

}
