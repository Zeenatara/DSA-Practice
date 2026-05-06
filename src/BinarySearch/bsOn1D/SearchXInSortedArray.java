package BinarySearch.bsOn1D;

import java.util.Scanner;

public class SearchXInSortedArray {

    public static int searchX(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            }

            else if (arr[mid] > x) {
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array:");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements in sorted order:");

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        System.out.println("Enter the element to search:");
        int x = input.nextInt();

        int result = searchX(arr, x);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }

        input.close();
    }
}