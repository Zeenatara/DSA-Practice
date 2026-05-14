package Strings.medium;

import java.util.*;

public class SortCharactersByFrequency {

    public static String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Max Heap based on frequency
        PriorityQueue<Character> pq = new PriorityQueue<>(
                (a, b) -> map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());

        StringBuilder ans = new StringBuilder();

        // Build final answer
        while (!pq.isEmpty()) {

            char ch = pq.poll();

            int freq = map.get(ch);

            for (int i = 0; i < freq; i++) {
                ans.append(ch);
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        String result = frequencySort(s);

        System.out.println("Sorted String by Frequency: " + result);

        sc.close();
    }
}