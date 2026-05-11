package BinarySearch.bsOnAnswer;

import java.util.Scanner;

public class PaintersPartition {

    public static int countPainters(int[] boards, int maxWork) {

        int painters = 1;
        int work = 0;

        for (int board : boards) {

            if (work + board > maxWork) {
                painters++;
                work = board;
            } else {
                work += board;
            }
        }

        return painters;
    }

    public static int paintersPartition(int[] boards, int painters) {

        int low = 0;
        int high = 0;

        for (int board : boards) {
            low = Math.max(low, board);
            high += board;
        }

        int ans = high;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int requiredPainters = countPainters(boards, mid);

            if (requiredPainters <= painters) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of boards: ");
        int n = sc.nextInt();

        int[] boards = new int[n];

        System.out.println("Enter board lengths:");

        for (int i = 0; i < n; i++) {
            boards[i] = sc.nextInt();
        }

        System.out.print("Enter number of painters: ");
        int painters = sc.nextInt();

        int result = paintersPartition(boards, painters);

        System.out.println("Minimum Maximum Work: " + result);

        sc.close();
    }
}