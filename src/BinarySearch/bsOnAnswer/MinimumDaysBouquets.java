package BinarySearch.bsOnAnswer;

import java.util.Scanner;

public class MinimumDaysBouquets {

    public static boolean canMakeBouquets(int[] bloomDay, int day, int m, int k) {

        int bouquets = 0;
        int count = 0;

        for (int bloom : bloomDay) {

            if (bloom <= day) {
                count++;
            } else {
                bouquets += count / k;
                count = 0;
            }
        }

        bouquets += count / k;

        return bouquets >= m;
    }

    public static int minDays(int[] bloomDay, int m, int k) {

        int n = bloomDay.length;

        if ((long) m * k > n) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int bloom : bloomDay) {
            low = Math.min(low, bloom);
            high = Math.max(high, bloom);
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (canMakeBouquets(bloomDay, mid, m, k)) {
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

        System.out.print("Enter number of flowers: ");
        int n = sc.nextInt();

        int[] bloomDay = new int[n];

        System.out.println("Enter bloom days:");

        for (int i = 0; i < n; i++) {
            bloomDay[i] = sc.nextInt();
        }

        System.out.print("Enter number of bouquets: ");
        int m = sc.nextInt();

        System.out.print("Enter flowers per bouquet: ");
        int k = sc.nextInt();

        int result = minDays(bloomDay, m, k);

        System.out.println("Minimum Days: " + result);

        sc.close();
    }
}