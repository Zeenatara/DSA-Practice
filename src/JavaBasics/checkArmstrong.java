package JavaBasics;

import java.util.Scanner;

public class checkArmstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        String str=Integer.toString(n);
int digit=String.valueOf(n).length();
        int sum=0;
        int temp=n;
       while(n>0){
           int digits =n%10;
           sum+=Math.pow(digits,digit);
           n/=10;
       }
      if(sum==temp){
          System.out.println(temp + " The number is an Armstrong number");
      }else{
          System.out.println(temp + " The number is NOT an Armstrong number");
      }
    }
}
