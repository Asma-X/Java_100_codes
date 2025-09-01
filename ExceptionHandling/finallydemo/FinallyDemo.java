package ExceptionHandling.finallydemo; // ✅ fixed

public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println("Caught by child");
        } catch (Exception e) {
            System.out.println("Caught by parent");
        } finally {
            System.out.println("This block always runs!");
        }
    }
}
