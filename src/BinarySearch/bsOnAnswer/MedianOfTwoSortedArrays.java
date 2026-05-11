package BinarySearch.bsOnAnswer;

import java.util.Scanner;

public class MedianOfTwoSortedArrays {

    public static double findMedianSortedArrays(int[] arr1, int[] arr2) {

        if(arr1.length > arr2.length) {
            return findMedianSortedArrays(arr2, arr1);
        }

        int n1 = arr1.length;
        int n2 = arr2.length;

        int low = 0;
        int high = n1;

        while(low <= high) {

            int cut1 = low + (high - low) / 2;

            int left = (n1 + n2 + 1) / 2;

            int cut2 = left - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];

            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : arr1[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : arr2[cut2];

            if(l1 <= r2 && l2 <= r1) {

                if((n1 + n2) % 2 == 1) {
                    return Math.max(l1, l2);
                }

                else {
                    return (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                }
            }

            else if(l1 > r2) {
                high = cut1 - 1;
            }

            else {
                low = cut1 + 1;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter first sorted array:");

        for(int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter second sorted array:");

        for(int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        double result = findMedianSortedArrays(arr1, arr2);

        System.out.println("Median: " + result);

        sc.close();
    }
}