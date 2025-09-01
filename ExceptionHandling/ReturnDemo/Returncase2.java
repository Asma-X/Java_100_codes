package ExceptionHandling.ReturnDemo;
// Avoid putting return, throw, or System.exit(0) inside finally.

public class Returncase2 {
    public static void main(String[] args) {
        System.out.println(demo());
    }

    static int demo() {
        try {
            System.out.println("In try");
            return 10;
        } finally {
            System.out.println("In finally");
            return 20; // 🚨 this overrides try’s return
        }
    }
}