package JavaBasics;

import java.util.Scanner;

public class palindromeInRange {

    static boolean isPalindrome(int num){

        int original=num;
        int reverse=0;
        while(num!=0){
            int digit=num % 10;
        reverse = reverse * 10 + digit;
            num/=10;
        }
        return original==reverse;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();

        for(int i=start; i<=end; i++){
            if(isPalindrome(i)){
                System.out.print(i+" ");
            }
        }

    }
}
