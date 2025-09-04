package Collections;

import java.util.*;

public class ArrayDeq {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the front and rear
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(25);
        deque.offerFirst(1);
        deque.offerLast(30);
        deque.add(15); // adds to the rear
        deque.offer(35); // adds to the rear

        // Displaying the elements
        System.out.println("ArrayDeque: " + deque);

        // Peek at the front and rear elements
        System.out.println("Peek: " + deque.peek()); // Retrieves the head of the deque
        System.out.println("Peek front: " + deque.peekFirst());
        System.out.println("Peek rear: " + deque.peekLast());

        // Removing elements from the front and rear
        System.out.println(deque.poll()); // Retrieves and removes the head of the deque
        System.out.println(deque);
        System.out.println(deque.pollLast()); // Retrieves and removes the tail of the deque
        System.out.println(deque.pollFirst()); // Retrieves and removes the head of the deque
        System.out.println("Removed from front: " + deque.removeFirst());
        System.out.println("Removed from rear: " + deque.removeLast());

        // Displaying the elements after removal
        System.out.println("ArrayDeque after removal: " + deque);
    }
}
