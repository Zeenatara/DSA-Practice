package JavaBasics;

import java.util.Scanner;

public class sumOfTwoPrimeNum {


    static boolean isPrime(int n) {
        if(n<=1) return false;
        for (int i=2; i*i<=n; i++) {
            if(n%i==0) return false;

        }
        return true;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i=2; i<=num/2; i++) {

            if (isPrime(i) && isPrime(num-i)) {
                System.out.println(i +"+"+ (num-i));
                return;
            }
        }
        System.out.println("NO Combination found");

    }
}
