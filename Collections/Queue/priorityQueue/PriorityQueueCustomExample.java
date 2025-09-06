package Collections.Queue.priorityQueue;

//By default, PriorityQueue<String> uses natural ordering (alphabetical).

//But here, you want ordering based on length, not alphabet.

//Passing a custom Comparator achieves that.

import java.util.*;

public class PriorityQueueCustomExample {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(
                (a, b) -> Integer.compare(a.length(), b.length()));

        pq.add("apple");
        pq.add("kiwi");
        pq.add("banana");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
