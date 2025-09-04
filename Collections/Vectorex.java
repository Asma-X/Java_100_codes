package Collections;

import java.util.*;

public class Vectorex {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("suresh");
        v1.add("siva");
        v1.add("vasrs");
        v1.add("suh");
        System.out.println(v1);

        Vector v2 = new Vector();
        v2.add("sesh");
        v2.add("sureh");

        // for (int i = 0; i < v2.size(); i++) {
        // v1.add(v2.get(i));
        // }
        Vector v3 = new Vector();
        v3.add("sureh");
        v3.add("sesh");

        v1.addAll(v2); // instead for loop
        // v1.addAll(0,v2); //if u add at 0th position

        // Deleting an element
        v1.remove("suh");
        // v1.remove(0);
        // v1.removeAll(v2);
        // v1.clear(); //to clear all elements

        v1.set(1, "asma");// updatiting an element

        System.out.println(v1.indexOf("asma"));
        System.out.println(v1);
        System.out.println(v1.containsAll(v2)); // to check v2 elements are present in v1 or not (verification)
        System.out.println(v1.containsAll(v3)); // to check v3 elements are present in v1 or not (verification)
        // System.out.println(v1.size());
        // System.out.println(v1.capacity());

    }

}
