package JavaBasics;

import java.util.Scanner;

public class checkpalindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number");
        int n =sc.nextInt();
        String str=Integer.toString(n);
        String rev=new StringBuilder(str).reverse().toString();
        if(str.equals(rev)){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }

    }
}
