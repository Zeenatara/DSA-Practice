package JavaBasics;

import java.util.Scanner;

public class primeNumInRange {
    static boolean isPrime(int n) {
        if(n<=1) return false;
        for (int i=2; i*i<=n; i++) {
            if(n%i==0) return false;

        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting number");
        int start = sc.nextInt();
        System.out.println("Enter ending number");
        int end = sc.nextInt();

        for(int i=start;i<=end;i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }

        }
    }
}
