// public class ReverseOfNum {
//     public static void main(String[] args) {
//         int num = 12345;
//         int reversed = 0;

//         while (num != 0) {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit;
//             num /= 10;
//         }

//         System.out.println("Reversed Number: " + reversed);
//     }
// }

// public class ReverseOfNum {
//     public static void main(String[] args) {
//         int num = 12345;
//         String str = Integer.toString(num);
//         String reversedStr = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversedStr += str.charAt(i);
//         }

//         int reversed = Integer.parseInt(reversedStr);
//         System.out.println("Reversed Number: " + reversed);
//     }
// }

// Using Recursion
// public class ReverseOfNum {
//     public static void main(String[] args) {
//         int num = 1234;
//         int reversed = ReversedNum(num);
//         System.out.println(reversed);

//     }

//     public static int ReversedNum(int num) {
//         int reversed = 0;
//         while (num != 0) {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit;
//             num /= 10;
//         }
//         return reversed;
//     }
// }

public class ReverseOfNum {
    static int rev = 0;

    static void reverse(int num) {
        if (num == 0) {
            return; // Base case
        }
        int digit = num % 10;
        rev = rev * 10 + digit;
        reverse(num / 10);
    }

    public static void main(String[] args) {
        int num = 1234;
        reverse(num);
        System.out.println("Reversed number = " + rev);
    }
}
