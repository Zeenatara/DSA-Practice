package BinarySearch.bsOnAnswer;

import java.util.Scanner;

public class SplitArrayLargestSum {

    public static int countParts(int[] arr, int maxSum) {

        int parts = 1;
        int currentSum = 0;

        for (int num : arr) {

            if (currentSum + num > maxSum) {
                parts++;
                currentSum = num;
            } else {
                currentSum += num;
            }
        }

        return parts;
    }

    public static int splitArray(int[] arr, int k) {

        int low = 0;
        int high = 0;

        for (int num : arr) {
            low = Math.max(low, num);
            high += num;
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int requiredParts = countParts(arr, mid);

            if (requiredParts <= k) {
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

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        int result = splitArray(arr, k);

        System.out.println("Minimum Largest Sum: " + result);

        sc.close();
    }
}