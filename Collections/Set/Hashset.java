package Collections.Set;

import java.util.*;

public class Hashset {

    public static void main(String[] args) {
        // Example: HashSet (No order, no duplicates)
        // Set<Integer> hs = new HashSet<>();
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(54);
        hs.add(6);
        hs.add(10); // duplicate, ignored
        System.out.println("HashSet: " + hs); // [20, 10] (order not guaranteed)

        System.out.println("Contains 20? " + hs.contains(20)); // true
        hs.remove(20); // remove element
        System.out.println("After removing 20: " + hs); // [10, 30, 54, 6]

        for (int elements : hs) {
            System.out.println(elements);
        }
    }
}
