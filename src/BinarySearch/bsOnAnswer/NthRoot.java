package BinarySearch.bsOnAnswer;

import java.util.Scanner;

public class NthRoot {

    public static long power(int base, int exponent, int limit) {

        long ans = 1;

        for(int i = 1; i <= exponent; i++) {

            ans = ans * base;

            if(ans > limit) {
                return ans;
            }
        }

        return ans;
    }

    public static int nthRoot(int n, int m) {

        int low = 1;
        int high = m;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            long value = power(mid, n, m);

            if(value == m) {
                return mid;
            }

            else if(value < m) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter m: ");
        int m = sc.nextInt();

        int result = nthRoot(n, m);

        System.out.println("Nth Root: " + result);

        sc.close();
    }
}