package ExceptionHandling.ReturnDemo;

public class Returncase1 {
    public static void main(String[] args) {
        System.out.println(demo());
    }

    static int demo() {
        try {
            System.out.println("In try");
            return 10; // ✅ return here
        } finally {
            System.out.println("In finally");
        }
    }
}
