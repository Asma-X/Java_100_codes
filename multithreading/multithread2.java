package multithreading;

//anonymous class
// public class multithread2 {
//     public static void main(String[] args) {
//         Runnable r1 = new Runnable() {
//             public void run() {
//                 System.out.println("hello");
//             }
//         };
//         Runnable r2 = new Runnable() {
//             public void run() {
//                 System.out.println("hi");
//             }
//         };
//         Thread t1 = new Thread(r1);
//         Thread t2 = new Thread(r2);

//         t1.start();
//         t2.start();
//     }

// }

public class multithread2 {
    public static void main(String[] args) {
        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello");
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 20; i++) {
                System.out.println("hi");
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        // t1.join();
        // t1.sleep(1000);

        t2.start();
    }

}