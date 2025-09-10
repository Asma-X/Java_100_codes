package Collections.Set;

import java.util.*;

public class TreeSetMethodsDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        // Adding elements
        ts.add(10);
        ts.add(20);
        ts.add(30);
        ts.add(40);
        ts.add(50);

        System.out.println("TreeSet: " + ts); // [10, 20, 30, 40, 50]

        // 1. first() and last()
        System.out.println("First element: " + ts.first()); // 10
        System.out.println("Last element: " + ts.last()); // 50

        // 2. ceiling() and floor()
        System.out.println("Ceiling of 25: " + ts.ceiling(25)); // 30
        System.out.println("Floor of 25: " + ts.floor(25)); // 20

        // 3. higher() and lower()
        System.out.println("Higher than 20: " + ts.higher(20)); // 30
        System.out.println("Lower than 20: " + ts.lower(20)); // 10

        // 4. headSet(), tailSet(), subSet()
        System.out.println("HeadSet (<30): " + ts.headSet(30)); // [10, 20]
        System.out.println("TailSet (>=30): " + ts.tailSet(30)); // [30, 40, 50]
        System.out.println("SubSet(20, 50): " + ts.subSet(20, 50)); // [20, 30, 40]

        // 5. pollFirst() and pollLast()
        System.out.println("PollFirst (removes first): " + ts.pollFirst()); // 10
        System.out.println("PollLast (removes last): " + ts.pollLast()); // 50
        System.out.println("After pollFirst & pollLast: " + ts); // [20, 30, 40]

        // 6. descendingSet()
        System.out.println("Descending Set: " + ts.descendingSet()); // [40, 30, 20]
    }
}
