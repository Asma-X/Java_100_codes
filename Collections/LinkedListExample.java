package Collections;

import java.lang.reflect.Array;
import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("a");
        al.add("b");
        al.add("c");
        // System.out.println(al);

        LinkedList<String> ll = new LinkedList<>();
        ll.add("d");
        ll.add("e");
        ll.add("f");
        // ll.addAll(al);
        ll.addAll(0, al);
        // ll.removeAll(al);
        System.out.println(ll);
    }

}
