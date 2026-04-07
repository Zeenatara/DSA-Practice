package JavaBasics;

import java.util.Scanner;

public class sumOfNPrimeNumInRange {

    static boolean isPrime(int n) {
        if(n<=1) return false;
        for (int i=2; i*i<=n; i+=2) {
            if(n%i==0) return false;

        }
        return true;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count=0;
        int n=2;
        int sum=0;

        while(count<num) {
            if(isPrime(n)) {
                sum+=n;
                count++;
            }
            n++;
        }
        System.out.println(sum);

    }
}
