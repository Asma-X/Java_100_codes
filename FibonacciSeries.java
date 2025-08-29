// public class sum {

//     public static void main(String[] args) {
//         int n = 15;
//         fib(n);

//     }

//     public static void fib(int n) {
//         int a = 0, b = 1, c;
//         System.out.print("Fibonacci Series: " + a + " " + b);
//         for (int i = 2; i < n; i++) {
//             c = a + b;
//             System.out.print(" " + c);
//             a = b;
//             b = c;
//         }
//         System.out.println();
//     }
// }

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 15; // number of terms you want
        fib(n);
    }

    static void fib(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }
        if (n == 1) {
            System.out.println("0");
            return;
        }

        int f[] = new int[n];
        f[0] = 0;
        f[1] = 1;

        StringBuilder sb = new StringBuilder();
        sb.append(f[0]).append(" , ").append(f[1]);

        for (int i = 2; i < n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            sb.append(" , ").append(f[i]);
        }
        System.out.println(sb.toString());
    }
}
