package multithreading;

public class PriorityDaemonDemo {
    public static void main(String[] args) {
        Thread high = new Thread(() -> {
            System.out.println("High priority task running");
        });
        high.setPriority(Thread.MAX_PRIORITY);

        Thread lowDaemon = new Thread(() -> {
            while (true) {
                System.out.println("Background task...");
                try {
                    Thread.sleep(500);
                } catch (Exception e) {
                }
            }
        });
        lowDaemon.setDaemon(true); // background thread

        high.start();
        lowDaemon.start();

        System.out.println("Main thread finished");
    }
}
