package BinarySearch.bson2D;

import java.util.Scanner;

public class Search2DMatrix {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int low = 0;
        int high = rows * cols - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int row = mid / cols;
            int col = mid % cols;

            int value = matrix[row][col];

            if(value == target) {
                return true;
            }

            else if(value < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        boolean found = searchMatrix(matrix, target);

        System.out.println(found);

        sc.close();
    }
}