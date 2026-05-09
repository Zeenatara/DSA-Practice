package BinarySearch.bsOnAnswer;

import java.util.Scanner;

public class SmallestDivisor {

    public static int calculateSum(int[] arr, int divisor) {

        int sum = 0;

        for (int num : arr) {
            sum += (num + divisor - 1) / divisor;
        }

        return sum;
    }

    public static int smallestDivisor(int[] arr, int threshold) {

        int low = 1;
        int high = 0;

        for (int num : arr) {
            high = Math.max(high, num);
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int sum = calculateSum(arr, mid);

            if (sum <= threshold) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter threshold: ");
        int threshold = sc.nextInt();

        int result = smallestDivisor(arr, threshold);

        System.out.println("Smallest Divisor: " + result);

        sc.close();
    }
}