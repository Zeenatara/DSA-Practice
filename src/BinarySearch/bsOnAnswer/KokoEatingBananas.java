package BinarySearch.bsOnAnswer;

import java.util.Scanner;

public class KokoEatingBananas {

    public static int calculateHours(int[] piles, int speed) {

        int totalHours = 0;

        for(int pile : piles) {
            totalHours += (pile + speed - 1) / speed;
        }

        return totalHours;
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        for(int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int totalHours = calculateHours(piles, mid);

            if(totalHours <= h) {
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

        System.out.print("Enter number of piles: ");
        int n = sc.nextInt();

        int[] piles = new int[n];

        System.out.println("Enter pile values:");

        for(int i = 0; i < n; i++) {
            piles[i] = sc.nextInt();
        }

        System.out.print("Enter hours: ");
        int h = sc.nextInt();

        System.out.println("Minimum Eating Speed: " + minEatingSpeed(piles, h));

        sc.close();
    }
}