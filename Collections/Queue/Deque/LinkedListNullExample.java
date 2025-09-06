package Collections.Queue.Deque;

import java.util.*;

public class LinkedListNullExample {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add(null); // ✅ Allowed
        list.add("B");

        System.out.println("LinkedList: " + list);
    }
}
