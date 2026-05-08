package BinarySearch.bsOn1D;

import java.util.Scanner;

public class RotationCount {

    public static int findRotationCount(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        int ans = Integer.MAX_VALUE;
        int index = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Left half sorted
            if (arr[low] <= arr[mid]) {

                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }

                low = mid + 1;
            }

            // Right half sorted
            else {

                if (arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }

                high = mid - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter rotated sorted array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int rotations = findRotationCount(arr);

        System.out.println("Array rotated " + rotations + " times");

        sc.close();
    }
}