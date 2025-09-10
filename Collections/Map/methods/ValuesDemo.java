package Collections.Map.methods;

import java.util.*;

public class ValuesDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "apple");
        map.put(2, "asma");
        map.put(3, "banana");
        map.put(4, "banana");
        map.put(5, "banana");

        Collection<String> values = map.values();
        System.out.println(values);

        for (String v : values) {
            System.out.println(v);
        }
    }
}
