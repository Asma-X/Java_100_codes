package ExceptionHandling;

public class Try {
    public static void main(String[] args) {

        try {
            int[] arr = { 1, 2, 3 };
            System.out.println(arr[5]); // ❌ Error
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid!");
        } finally {
            System.out.println("This block always runs!");
        }

    }
}
