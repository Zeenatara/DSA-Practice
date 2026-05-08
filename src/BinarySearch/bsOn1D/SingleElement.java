package BinarySearch.bsOn1D;

import java.util.Scanner;

public class SingleElement {

    public static int singleNonDuplicate(int[] arr) {

        int low = 0;
        int high = arr.length - 2;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if((mid % 2 == 0 && arr[mid] == arr[mid + 1]) ||
                    (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {

                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return arr[low];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = singleNonDuplicate(arr);

        System.out.println("Single Element: " + result);

        sc.close();
    }
}