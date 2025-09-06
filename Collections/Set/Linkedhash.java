
package Collections.Set;

import java.util.*;

public class Linkedhash {
    public static void main(String[] args) {
        // Example: LinkedHashSet (Maintains insertion order, no duplicates)

        // LinkedHashSet ->LinkedHashMap ->link of nodes(key,value)
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(20);
        lhs.add(30);
        lhs.add(54);
        lhs.add(6);
        lhs.add(10); // duplicate, ignored
        System.out.println("LinkedHashSet: " + lhs); // [10, 20, 30, 54, 6]

        System.out.println("Contains 20? " + lhs.contains(20)); // true
        lhs.remove(20); // remove element
        System.out.println("After removing 20: " + lhs); // [10, 30, 54, 6]

        for (int elements : lhs) {
            System.out.println(elements);
        }
    }
}
