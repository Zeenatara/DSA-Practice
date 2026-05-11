package BinarySearch.bson2D;

import java.util.Scanner;

public class MedianRowWiseSortedMatrix {

    public static int upperBound(int[] row, int x) {

        int low = 0;
        int high = row.length - 1;
        int ans = row.length;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (row[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static int countSmallEqual(int[][] matrix, int x) {

        int count = 0;

        for (int i = 0; i < matrix.length; i++) {
            count += upperBound(matrix[i], x);
        }

        return count;
    }

    public static int median(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int i = 0; i < rows; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][cols - 1]);
        }

        int required = (rows * cols) / 2;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int smallEqual = countSmallEqual(matrix, mid);

            if (smallEqual <= required) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter row-wise sorted matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int result = median(matrix);

        System.out.println("Median: " + result);

        sc.close();
    }
}