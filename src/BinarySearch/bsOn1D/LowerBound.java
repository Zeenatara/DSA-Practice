
package BinarySearch.bsOn1D;
import java.util.Scanner;



public class LowerBound {

    public static int lowerBound(int[] arr, int x) {

        int low = 0;
        int high = arr.length - 1;

        int ans = arr.length;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] >= x) {

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

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter sorted array elements:");

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int x = sc.nextInt();

        int result = lowerBound(arr, x);

        System.out.println("Lower Bound Index: " + result);

        sc.close();
    }
}