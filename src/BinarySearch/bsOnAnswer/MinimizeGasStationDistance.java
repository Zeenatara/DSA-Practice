package BinarySearch.bsOnAnswer;

import java.util.Scanner;

public class MinimizeGasStationDistance {

    public static int numberOfStationsRequired(int[] stations, double dist) {

        int count = 0;

        for (int i = 1; i < stations.length; i++) {

            double gap = stations[i] - stations[i - 1];

            count += (int)(gap / dist);

            if (gap % dist == 0) {
                count--;
            }
        }

        return count;
    }

    public static double minimizeMaxDistance(int[] stations, int k) {

        double low = 0;
        double high = 0;

        for (int i = 1; i < stations.length; i++) {
            high = Math.max(high, stations[i] - stations[i - 1]);
        }

        double diff = 1e-6;

        while (high - low > diff) {

            double mid = (low + high) / 2.0;

            int required = numberOfStationsRequired(stations, mid);

            if (required > k) {
                low = mid;
            } else {
                high = mid;
            }
        }

        return high;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of existing stations: ");
        int n = sc.nextInt();

        int[] stations = new int[n];

        System.out.println("Enter station positions:");

        for (int i = 0; i < n; i++) {
            stations[i] = sc.nextInt();
        }

        System.out.print("Enter number of new stations: ");
        int k = sc.nextInt();

        double result = minimizeMaxDistance(stations, k);

        System.out.printf("Minimum Maximum Distance: %.6f", result);

        sc.close();
    }
}