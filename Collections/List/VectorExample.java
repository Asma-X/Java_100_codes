package Collections.List;

import java.util.*;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        // Adding
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("Vector: " + numbers);

        // Access
        System.out.println("First element: " + numbers.firstElement());
        System.out.println("Last element: " + numbers.lastElement());
        System.out.println("element: " + numbers.get(2));

        // Remove
        numbers.remove(1);
        System.out.println("After removal: " + numbers);

        // Search
        System.out.println("Contains 30? " + numbers.contains(30));
    }
}
