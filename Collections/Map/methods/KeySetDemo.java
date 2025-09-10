package Collections.Map.methods;

import java.util.*;

public class KeySetDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");

        Set<Integer> asma = map.keySet();
        System.out.println(asma);

        for (Integer keys : asma) {
            System.out.println(keys);
        }

    }
}
