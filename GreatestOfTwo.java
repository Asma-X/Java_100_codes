// // using ternary operator
// public class GreatestOfTwo {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 34;
//         if (a == b) {
//             System.out.println("Both are equal");
//         } else {
//             int max = (a > b) ? a : b;
//             System.out.println("The greatest of two is " + max);
//         }
//     }
// }

public class GreatestOfTwo {
    public static void main(String[] args) {
        int a = 29;
        int b = 30;
        if (a == b) {
            System.out.println("equal");
        } else if (a > b) {
            System.out.println("a is greater");
        } else {
            System.out.println("b is greater");
        }
    }
}