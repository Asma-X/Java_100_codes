package Collections;

import java.util.*;

public class StackEx {
    public static void main(String[] args) {
        /*
         * Lifo -last in first out -stack
         * stack is a cls in java which implements the list interface and extends the
         * vector cls and also
         * represents the lifo principle
         */
        Stack<String> books = new Stack<>();
        books.add("red");
        books.add("black");
        books.add("white");
        books.push("asma");
        books.push("sai");
        // books.add(0, "white");

        // books.remove(0);
        // books.add("asma");

        // books.set(0,"yellow");
        // System.out.println(books.contains("asma"));
        System.out.println(books.peek());
        // System.out.println(books.pop());
        System.out.println(books.search("red")); // searching from last
        System.out.println(books.indexOf("red"));
        System.out.println(books);
    }
}
