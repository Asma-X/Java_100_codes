package Collections.Queue.priorityQueue;

//Max-Heap using Comparator

/* 
import java.util.*;

public class Maxheap {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxheap = new PriorityQueue<>(Comparator.reverseOrder());
        maxheap.add(30);
        maxheap.add(10);
        maxheap.add(20);

        System.out.println("MaxHeap: " + maxheap); // [30, 10, 20] (heap order, not sorted)

        System.out.println("Peek (head): " + maxheap.peek()); // 30 (largest)
        System.out.println("Poll (remove head): " + maxheap.poll()); // 30
        System.out.println("After poll: " + maxheap); // [20, 10]
    }
}
*/

//Largest alphabet comes first = Max-Heap ordering.
import java.util.*;

public class Maxheap {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add("banana");
        pq.add("apple");
        pq.add("cherry");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }
    }
}
