package Collections.List;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        // Adding
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        System.out.println("Fruits: " + fruits);

        // Access
        System.out.println("First fruit: " + fruits.get(0));

        // Update
        fruits.set(1, "Mango");
        System.out.println("Updated List: " + fruits);

        // Remove
        fruits.remove("Apple");
        System.out.println("After removal: " + fruits);

        // Search
        System.out.println("Contains Orange? " + fruits.contains("Orange"));
    }
}
