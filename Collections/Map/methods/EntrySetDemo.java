package Collections.Map.methods;

import java.util.*;

public class EntrySetDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("Entries: " + entries); // [1=Apple, 2=Banana, 3=Mango]

        // Iterating entries
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
