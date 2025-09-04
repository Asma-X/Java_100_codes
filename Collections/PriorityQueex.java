package Collections;

import java.util.*;

public class PriorityQueex {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        // lowest integer high priority
        // default size is 11
        // Adding elements to the priority queue
        pq.add(10);
        pq.add(20);
        pq.add(15);

        // Addition - offer, add
        pq.offer(25);
        pq.add(30);

        // Retrieval - peek returns only head element
        System.out.println("Peek Element: " + pq.peek());

        // Displaying the elements in the priority queue
        System.out.println("Priority Queue: " + pq);

        // Removing the highest priority element // poll removes head element
        int removedElement = pq.poll();
        System.out.println("Removed Element: " + removedElement);

        // verifying
        System.out.println("Is 20 present? " + pq.contains(20));
        System.out.println("Is 25 present? " + pq.contains(25));

        // Displaying the elements after removal
        System.out.println("Priority Queue after removal: " + pq);
    }
}
