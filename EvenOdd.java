// // ternary operators

// public class EvenOdd {
//     public static void main(String[] args) {
//         int number = 39;

//         String status = number % 2 == 0 ? " is Even" : " Is Odd";
//         System.out.println(number + status);
//     }
// }

// Bitwise operator

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        // int number = 39;
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (isEven(number))
            System.out.println("number is even");
        else
            System.out.println("number is odd");
        sc.close();
    }

    static boolean isEven(int number) {
        return (number & 1) == 0;
    }
}