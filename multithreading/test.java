package multithreading;

public class test {
    public static void main(String[] args) {
        System.out.println("hello asma");
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getId());
    }
}
