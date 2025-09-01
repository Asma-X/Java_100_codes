package ExceptionHandling.finallydemo;

public class SystemExitFinally {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            System.exit(0); // JVM shutdown 🚨
        } catch (Exception e) {
            System.out.println("Inside catch block");
        } finally {
            System.out.println("Inside finally block");
        }
        System.out.println("End of program");
    }
}
