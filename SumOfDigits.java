// // Using loop
// public class SumOfDigits {
//     public static void main(String[] args) {
//         int num = 1234;
//         int sum = 0;

//         while (num > 0) {
//             int digit = num % 10;
//             sum += digit;
//             num = num / 10;
//         }
//         System.out.println(sum);
//     }
// }

// // Using recursion
// public class SumOfDigits {

//     static int sumDigits(int num) {
//         if (num == 0) {
//             return 0;
//         }
//         return num % 10 + sumDigits(num / 10);
//     }

//     public static void main(String[] args) {
//         int num = 1234;
//         System.out.println(sumDigits(num));
//     }
// }

// using ascii

public class SumOfDigits {

    public static void main(String[] args) {
        int num = 1234;
        String str = Integer.toString(num);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            char digitChar = str.charAt(i);
            int digit = digitChar - '0'; // Convert char to int using ASCII value
            sum += digit;
        }
        System.out.println(sum);
    }
}