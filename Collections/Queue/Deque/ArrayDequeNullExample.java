package Collections.Queue.Deque;

import java.util.*;

public class ArrayDequeNullExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.add("A");
        deque.add(null); // ❌ Throws NullPointerException
        deque.add("B");

        System.out.println("ArrayDeque: " + deque);
    }
}
