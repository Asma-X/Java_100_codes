package Collections.Queue.BlockingQueue;

import java.util.concurrent.*;

//Can be bounded (fixed size) or unbounded (default = Integer.MAX_VALUE).

//Useful when tasks can grow dynamically.
public class LinkedBlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>(2); // bounded

        queue.put("A");
        queue.put("B");
        System.out.println("Queue: " + queue);

        // queue.put("C"); // ❌ Blocks (since capacity = 2)

        System.out.println("Removed: " + queue.take());
        queue.put("C"); // Now it succeeds
        System.out.println("Queue after adding C: " + queue);
    }
}
