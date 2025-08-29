// import java.util.Scanner;

// public class Palindrome {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         // Taking input from user
//         System.out.print("Enter a number or string: ");
//         String input = sc.nextLine(); // reads input as string

//         // Check palindrome
//         if (isPalindrome(input)) {
//             System.out.println(input + " is a Palindrome");
//         } else {
//             System.out.println(input + " is NOT a Palindrome");
//         }

//         sc.close();
//     }

//     // Method to check palindrome
//     public static boolean isPalindrome(String input) {
//         String rev = new StringBuilder(input).reverse().toString();
//         return input.equals(rev);
//     }
// }

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a string");

        String input = sc.nextLine();

        input = input.toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        Boolean isPalindrome = true;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
        sc.close();
    }
}
