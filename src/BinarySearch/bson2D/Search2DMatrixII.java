package BinarySearch.bson2D;

import java.util.Scanner;

public class Search2DMatrixII {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;

        while(row < rows && col >= 0) {

            int current = matrix[row][col];

            if(current == target) {
                return true;
            }

            else if(current > target) {
                col--;
            }

            else {
                row++;
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
