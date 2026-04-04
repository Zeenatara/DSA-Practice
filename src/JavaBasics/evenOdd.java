package JavaBasics;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number ");
        n = input.nextInt();
        if(n%2==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }
}
