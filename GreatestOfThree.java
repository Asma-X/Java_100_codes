// public class GreatestOfThree {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         int c = 15;

//         if (a == b && b == c) {
//             System.out.println("All three numbers are equal");
//         } else {
//             int max = a; // Assume a is the greatest initially
//             if (b > max) {
//                 max = b; // Update max if b is greater
//             }
//             if (c > max) {
//                 max = c; // Update max if c is greater
//             }
//             System.out.println("The greatest of three is " + max);
//         }
//     }
// }

// public class GreatestOfThree {

//     public static void main(String[] args) {
//         int a = 10, b = 20, c = 30;
//         if (a == b && b == c) {
//             System.out.println("All are equal");
//         } else {
//             int temp = a > b ? a : b;
//             int result = temp > c ? temp : c;

//             System.out.println("result: " + result);
//         }
//     }
// }

import java.util.Scanner;

public class GreatestOfThree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("The greatest number is: " + a);
        } else if (b >= a && b >= c) {
            System.out.println("The greatest number is: " + b);
        } else {
            System.out.println("The greatest number is: " + c);
        }
        sc.close();
    }
}
