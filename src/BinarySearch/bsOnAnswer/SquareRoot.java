package BinarySearch.bsOnAnswer;

import java.util.Scanner;

public class SquareRoot {

    public static int squareRoot(int n) {

        int low = 1;
        int high = n;

        int ans = 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            long value = (long) mid * mid;

            if(value <= n) {

                ans = mid;
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int result = squareRoot(n);

        System.out.println("Square Root: " + result);

        sc.close();
    }
}