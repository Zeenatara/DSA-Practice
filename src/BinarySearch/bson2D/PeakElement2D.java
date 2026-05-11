package BinarySearch.bson2D;

import java.util.Scanner;

public class PeakElement2D {

    public static int findMaxRow(int[][] matrix, int col) {

        int maxRow = 0;

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][col] > matrix[maxRow][col]) {
                maxRow = i;
            }
        }

        return maxRow;
    }

    public static int[] findPeakGrid(int[][] matrix) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = cols - 1;

        while (low <= high) {

            int midCol = low + (high - low) / 2;

            int maxRow = findMaxRow(matrix, midCol);

            int left = midCol - 1 >= 0 ? matrix[maxRow][midCol - 1] : -1;
            int right = midCol + 1 < cols ? matrix[maxRow][midCol + 1] : -1;

            int current = matrix[maxRow][midCol];

            if (current > left && current > right) {
                return new int[]{maxRow, midCol};
            }

            else if (left > current) {
                high = midCol - 1;
            }

            else {
                low = midCol + 1;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int[] result = findPeakGrid(matrix);

        System.out.println("Peak Position: " + result[0] + " " + result[1]);

        sc.close();
    }
}