package BinarySearch.bsOnAnswer;

import java.util.Scanner;

public class ShipPackages {

    public static int calculateDays(int[] weights, int capacity) {

        int days = 1;
        int load = 0;

        for(int weight : weights) {

            if(load + weight > capacity) {

                days++;
                load = weight;
            }

            else {
                load += weight;
            }
        }

        return days;
    }

    public static int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for(int weight : weights) {

            low = Math.max(low, weight);
            high += weight;
        }

        int ans = high;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int requiredDays = calculateDays(weights, mid);

            if(requiredDays <= days) {

                ans = mid;
                high = mid - 1;
            }

            else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of packages: ");
        int n = sc.nextInt();

        int[] weights = new int[n];

        System.out.println("Enter package weights:");

        for(int i = 0; i < n; i++) {
            weights[i] = sc.nextInt();
        }

        System.out.print("Enter days: ");
        int days = sc.nextInt();

        int result = shipWithinDays(weights, days);

        System.out.println("Minimum Capacity: " + result);

        sc.close();
    }
}