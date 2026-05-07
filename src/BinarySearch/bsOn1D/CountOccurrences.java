package BinarySearch.bsOn1D;

import java.util.Scanner;

public class CountOccurrences {

    public static int firstOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {

                ans = mid;
                high = mid - 1;
            }

            else if(arr[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int lastOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {

                ans = mid;
                low = mid + 1;
            }

            else if(arr[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int countOccurrences(int[] arr, int target) {

        int first = firstOccurrence(arr, target);

        if(first == -1) {
            return 0;
        }

        int last = lastOccurrence(arr, target);

        return last - first + 1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int result = countOccurrences(arr, target);

        System.out.println("Occurrences: " + result);

        sc.close();
    }
}
