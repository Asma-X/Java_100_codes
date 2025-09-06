package Collections.Queue.Deque;

import java.util.*;

public class LinkedListDequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();

        // Queue behavior (FIFO)
        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerLast(3);
        System.out.println("Queue (FIFO): " + deque); // [1, 2, 3]
        System.out.println("Poll (FIFO): " + deque.pollFirst()); // 1
        System.out.println("After poll: " + deque); // [2, 3]

        // Stack behavior (LIFO)
        deque.push(10); // same as addFirst(10)
        deque.push(20);
        deque.push(30);
        System.out.println("Stack (LIFO): " + deque); // [30, 20, 10, 2, 3]
        System.out.println("Pop (LIFO): " + deque.pop()); // 30
        System.out.println("After pop: " + deque); // [20, 10, 2, 3]

        // Accessing first & last
        System.out.println("First element: " + deque.getFirst()); // 20
        System.out.println("Last element: " + deque.getLast()); // 3
    }
}
