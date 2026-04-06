package JavaBasics;

import java.util.Scanner;


public class countDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int count =0;



        if(num==0){
            count=1;
        }else{
            while(num>0){
                count++;
                num=num/10;
            }


        }
        System.out.println(count);
    }
}



