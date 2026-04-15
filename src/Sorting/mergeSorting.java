package Sorting;

import java.util.Scanner;

public class mergeSorting {

    public static void mergeSort(int[] arr, int l, int r) {
        if (l >= r) return;

        int m = (l + r) / 2;

        mergeSort(arr, l, m);
        mergeSort(arr, m + 1, r);

        merge(arr, l, m, r);
    }

    static void merge(int[] arr, int l, int m, int r) {
        int[] temp = new int[r - l + 1];

        int i = l, j = m + 1, k = 0;

        while (i <= m && j <= r) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        while (i <= m) temp[k++] = arr[i++];
        while (j <= r) temp[k++] = arr[j++];


        for (int p = l, q = 0; p <= r; p++, q++) {
            arr[p] = temp[q];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        mergeSort(arr, 0, n - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}