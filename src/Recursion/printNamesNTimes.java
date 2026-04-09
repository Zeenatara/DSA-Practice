package Recursion;

import java.util.Scanner;

 class printNamesNTimes {
    public void printNames(String name,int count,int n){
        if (count>=n)
            return;

        System.out.println(name);

        printNames(name,count+1,n);



    }


    public static void main(String[] args) {
        printNamesNTimes p1=new printNamesNTimes();


        Scanner sc=new Scanner(System.in);
        int n=5;
        String name="Zeenat";
        p1.printNames(name,0,n);




    }


}





