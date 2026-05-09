package BinarySearch.bsOnAnswer;

import java.util.Scanner;

public class BookAllocation {

    public static int countStudents(int[] books, int maxPages) {

        int students = 1;
        int pages = 0;

        for (int book : books) {

            if (pages + book > maxPages) {
                students++;
                pages = book;
            } else {
                pages += book;
            }
        }

        return students;
    }

    public static int bookAllocation(int[] books, int students) {

        if (students > books.length) {
            return -1;
        }

        int low = 0;
        int high = 0;

        for (int book : books) {
            low = Math.max(low, book);
            high += book;
        }

        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int requiredStudents = countStudents(books, mid);

            if (requiredStudents <= students) {
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

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();

        int[] books = new int[n];

        System.out.println("Enter pages in each book:");

        for (int i = 0; i < n; i++) {
            books[i] = sc.nextInt();
        }

        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int result = bookAllocation(books, students);

        System.out.println("Minimum Maximum Pages: " + result);

        sc.close();
    }
}
