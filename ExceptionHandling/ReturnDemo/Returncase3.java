package ExceptionHandling.ReturnDemo;

public class Returncase3 {
    public static void main(String[] args) {
        System.out.println(demo());
    }

    static int demo() {
        try {
            int x = 5 / 0; // 🚨 exception
            return 1;
        } catch (Exception e) {
            System.out.println("In catch");
            return 2;
        } finally {
            System.out.println("In finally");
        }
    }
}