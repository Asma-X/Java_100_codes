package Collections;

// import java.security.KeyStore.Entry;
// import java.util.Collection;
// import java.util.Set;
// import java.util.Map;
import java.util.*;

//import java.util.Hashtable;

public class Mapex {
    public static void main(String[] args) {
        Map<Integer, String> map = new Hashtable<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        // // Display the map
        System.out.println("Map: " + map);

        // // Retrieval of keys from the map
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key);
        }

        // // to get the key and values
        for (Integer key : keys) {
            System.out.println(key + "------> " + map.get(key));
        }

        // System.out.println();

        // // Retrieval of values from the map
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }

        // System.out.println(map.get(1));
        System.out.println(map);

        // Remove a key-value pair
        map.remove(2);
        System.out.println(map);
        System.out.println(map.containsKey(1));

        // Update
        System.out.println(map.putIfAbsent(4, "Four"));
        System.out.println(map.replace(3, "Three Updated"));

        System.out.println(map.containsValue("One"));

        // Display key-value pairs
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        for (Map.Entry<Integer, String> entry : entrySet) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "------> " + value);
        }
    }
}
