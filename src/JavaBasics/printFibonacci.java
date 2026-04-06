package JavaBasics;

import java.util.Scanner;

public class printFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        int a=0,b=1;
        for(int i=1;i<=n;i++){
            System.out.print(a+" ");

            int next=a+b;
            a=b;
            b=next;
        }

    }
}
