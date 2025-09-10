package Collections.Map;

import java.util.*;

public class MapCommonMethodsDemo {
    public static void main(String[] args) {
        // Create a HashMap (can replace with LinkedHashMap / TreeMap to test)
        Map<Integer, String> map = new HashMap<>();

        // 1. put() - insert key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");
        map.put(2, "Orange"); // updates value for key=2

        System.out.println("Initial Map: " + map); // {1=Apple, 2=Orange, 3=Mango}

        // 2. get() - get value by key
        System.out.println("Get key 1: " + map.get(1)); // Apple
        System.out.println("Get key 4 (not exists): " + map.get(4)); // null

        // 3. remove() - remove by key
        map.remove(3);
        System.out.println("After removing key 3: " + map); // {1=Apple, 2=Orange}

        // 4. containsKey() and containsValue()
        System.out.println("Contains key 2? " + map.containsKey(2)); // true
        System.out.println("Contains value 'Banana'? " + map.containsValue("Banana")); // false
        System.out.println("Contains value 'Orange'? " + map.containsValue("Orange")); // true

        // 5. keySet() - returns set of keys
        Set<Integer> keys = map.keySet();
        System.out.println("Keys: " + keys); // [1, 2]

        // 6. values() - returns collection of values
        Collection<String> values = map.values();
        System.out.println("Values: " + values); // [Apple, Orange]

        // 7. entrySet() - returns set of key-value pairs (Map.Entry)
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        System.out.println("Entries: " + entries); // [1=Apple, 2=Orange]

        // Iterating using entrySet
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

        // Using forEach (Java 8+)
        map.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));
    }
}
