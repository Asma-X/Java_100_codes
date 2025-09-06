package Collections.Queue.priorityQueue;

//Natural Ordering (Default Min-Heap)

import java.util.*;

public class Minheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("PriorityQueue: " + pq); // [10, 30, 20] (heap order, not sorted)

        System.out.println("Peek (head): " + pq.peek()); // 10 (smallest)
        System.out.println("Poll (remove head): " + pq.poll()); // 10
        System.out.println("After poll: " + pq); // [20, 30]
    }
}

// Example 1: Min-Heap with Strings (Natural Order = Alphabetical)

// Smallest alphabet comes first = Min-Heap ordering.

/*
 * import java.util.*;
 * 
 * public class Minheap {
 * public static void main(String[] args) {
 * PriorityQueue<String> pq = new PriorityQueue<>();
 * 
 * pq.add("banana");
 * pq.add("apple");
 * pq.add("cherry");
 * 
 * while (!pq.isEmpty()) {
 * System.out.println(pq.poll());
 * }
 * }
 * }
 */
