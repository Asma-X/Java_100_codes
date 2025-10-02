package Java8features;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Foreach {
    public static void main(String[] args) {
        List<Integer> asma = Arrays.asList(1, 4, 5, 2, 7, 5);

        // asma.forEach(i -> System.out.println(i));
        asma.forEach(i -> {
            if (i % 2 == 0)
                System.out.println("even");
            else
                System.out.println("odd");
        });

        Map<Integer, String> maps = new HashMap<>();
        maps.put(102, "asma");
        maps.put(103, "asa");
        maps.put(104, "ama");

        maps.forEach((key, value) -> System.out.println(key + ">>>" + value));
    }
}