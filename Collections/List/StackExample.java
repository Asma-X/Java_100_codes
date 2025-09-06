package Collections.List;

import java.util.*;

public class StackExample {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        // Push elements
        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");
        stack.push("E");

        System.out.println("Stack: " + stack); // [A, B, C, D, E]

        // Peek (see top element)
        System.out.println("Top: " + stack.peek()); // E

        // get element at index
        System.out.println("Element at index 1: " + stack.get(1)); // B

        // Pop (remove top element)
        System.out.println("Popped: " + stack.pop()); // C
        System.out.println("After pop: " + stack); // [A, B]

        // Remove by index
        System.out.println("Removed index 1: " + stack.remove(1)); // B
        System.out.println("After removing index 1: " + stack); // [A, C]

        // Search (1-based index from top)
        System.out.println("Position of A: " + stack.search("A")); // 2

        // Check empty
        System.out.println("Is empty? " + stack.isEmpty()); // false
    }
}
