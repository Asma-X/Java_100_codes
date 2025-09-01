package ExceptionHandling;

// //Error: Unreachable catch block for ArithmeticException.
////if we gives the wrong order

// public class Catch {
//     public static void main(String[] args) {
//         try {
//             int a = 10 / 0;

//         } catch (Exception e) { // ❌ parent first
//             System.out.println("Caught by parent");
//         } catch (ArithmeticException e) { // ❌ unreachable
//             System.out.println("Caught by child");
//         }

//     }

// }

// Correct Order
public class Catch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) { // ✅ child first
            System.out.println("Caught by child");
        } catch (Exception e) { // ✅ parent last
            System.out.println("Caught by parent");
        }

    }

}