package JavaBasics;

import java.util.Scanner;

public class armstrongnumberInRange {

    static boolean isArmstrong(int n){
       int original=n;
       int sum=0;

       int digits=String.valueOf(n).length();
       while(n!=0){
           int digit=n%10;
           sum+=(int)Math.pow(digit,digits);
           n=n/10;

       }
       return sum==original;

    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int start=sc.nextInt();
      int end=sc.nextInt();

      for(int i=start; i<=end; i++){
          if(isArmstrong(i)){
              System.out.print(i+" ");
          }
      }
    }
}
