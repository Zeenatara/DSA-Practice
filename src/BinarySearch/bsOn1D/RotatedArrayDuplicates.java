package BinarySearch.bsOn1D;

import java.util.Scanner;

public class RotatedArrayDuplicates {

    public static boolean search(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                return true;
            }

            if(arr[low] == arr[mid] && arr[mid] == arr[high]) {

                low++;
                high--;
            }

            else if(arr[low] <= arr[mid]) {

                if(target >= arr[low] && target < arr[mid]) {
                    high = mid - 1;
                }

                else {
                    low = mid + 1;
                }
            }

            else {

                if(target > arr[mid] && target <= arr[high]) {
                    low = mid + 1;
                }

                else {
                    high = mid - 1;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter rotated sorted array:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean result = search(arr, target);

        System.out.println(result);

        sc.close();
    }
}
