package Collections.Set;

import java.util.*;

public class Treesetex {
    public static void main(String[] args) {
        // Example: TreeSet (Sorted order, no duplicates)
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(54);
        ts.add(6);
        ts.add(10); // duplicate, ignored
        System.out.println("TreeSet: " + ts); // [6, 10, 20, 30, 54]

        System.out.println("Contains 20? " + ts.contains(20)); // true
        ts.remove(20); // remove element
        System.out.println("After removing 20: " + ts); // [6, 10, 30, 54]

        for (int elements : ts) {
            System.out.println(elements);
        }
        System.out.println("First (smallest): " + ts.first()); // 6
        System.out.println("Last (largest): " + ts.last()); // 54
        System.out.println("Poll first: " + ts.pollFirst()); // 6 (removes and returns)
        System.out.println("poll last: " + ts.pollLast()); // 54 (removes and returns)
        System.out.println(ts.subSet(6, 30)); // [10, 30] (from 6 to 30, 30 inclusive)
        System.out.println(ts.descendingSet()); // [30, 10] (reverse order)
        System.out.println("After polling: " + ts); // [10, 30]

    }
}
