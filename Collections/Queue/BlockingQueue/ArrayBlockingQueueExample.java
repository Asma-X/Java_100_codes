package Collections.Queue.BlockingQueue;

import java.util.concurrent.*;

public class ArrayBlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3); // capacity = 3

        queue.put("A");
        queue.put("B");
        queue.put("C");
        System.out.println("Queue after 3 inserts: " + queue);

        // queue.put("D"); // ❌ Blocks here (waits until space is free)

        System.out.println("Removed: " + queue.take()); // Removes A
        System.out.println("Queue after take: " + queue);
    }
}
