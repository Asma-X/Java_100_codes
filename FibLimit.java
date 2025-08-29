public class FibLimit {
    public static void main(String[] args) {
        int n = 15; // limit for Fibonacci series
        fib(n);
    }

    static void fib(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        int a = 0, b = 1;
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        while (b < n) {
            sb.append(" , ").append(b);
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(sb.toString());
    }
}