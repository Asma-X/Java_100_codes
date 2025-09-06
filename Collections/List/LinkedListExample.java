package Collections.List;

import java.util.*;
/*
 * Since LinkedList implements the List interface,
 * it supports all the common List methods like 
 * add(), get(), set(), remove(), size(), isEmpty(), contains(), indexOf(), etc.

👉 On top of that, because LinkedList also implements Deque, 
it gives you extra methods like 
addFirst(), addLast(), getFirst(), getLast(), removeFirst(), removeLast().
 */

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        // common List methods
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println("List: " + list); // [A, B, C]

        System.out.println("Element at index 1: " + list.get(1)); // B
        list.set(1, "BB");
        System.out.println("After set: " + list); // [A, BB, C]

        list.remove("BB");
        System.out.println("After remove: " + list); // [A, C]

        System.out.println("Size: " + list.size()); // 2
        System.out.println("Contains A? " + list.contains("A")); // true
        System.out.println("Index of C: " + list.indexOf("C")); // 1
        System.out.println("Is Empty? " + list.isEmpty()); // false

        // Extra Deque methods(because LinkedList implements Deque)
        // Add at first and last
        list.addFirst("Start");
        list.addLast("End");
        System.out.println("After addFirst/addLast: " + list); // [Start, A, B, C, End]

        // Get elements
        System.out.println("First: " + list.getFirst()); // Start
        System.out.println("Last: " + list.getLast()); // End

        // Remove elements
        list.removeFirst();
        list.removeLast();
        System.out.println("After removals: " + list); // [A, B, C]

        // Queue behavior (FIFO)
        list.add("D");
        System.out.println("Removed (Queue): " + list.remove()); // removes A
        System.out.println("List now: " + list); // [B, C, D]
    }
}
