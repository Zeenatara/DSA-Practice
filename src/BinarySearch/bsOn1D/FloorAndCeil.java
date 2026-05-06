
package BinarySearch.bsOn1D;
import java.util.Scanner;

public class FloorAndCeil {

    public static int floor(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] <= x) {

                ans = arr[mid];
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static int ceil(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] >= x) {

                ans = arr[mid];
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

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int x = sc.nextInt();

        System.out.println("Floor: " + floor(arr, x));
        System.out.println("Ceil: " + ceil(arr, x));

        sc.close();
    }
}