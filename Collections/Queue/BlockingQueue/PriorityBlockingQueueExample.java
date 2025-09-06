package Collections.Queue.BlockingQueue;

import java.util.concurrent.*;

public class PriorityBlockingQueueExample {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new PriorityBlockingQueue<>();

        queue.put(30);
        queue.put(10);
        queue.put(20);

        System.out.println("Queue (heap order, not sorted): " + queue);

        System.out.println("Removed: " + queue.take()); // 10
        System.out.println("Removed: " + queue.take()); // 20
        System.out.println("Removed: " + queue.take()); // 30
    }
}
