// import java.util.Scanner;

// public class Armstrong {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int num = sc.nextInt();

//         int original = num;
//         int digit = String.valueOf(num).length();
//         int sum = 0;

//         while (num > 0) {
//             int lastDigit = num % 10;
//             sum += Math.pow(lastDigit, digit);
//             num /= 10;

//         }
//         if (sum == original) {
//             System.out.println(original + " is an Armstrong number.");
//         } else {
//             System.out.println(original + " is NOT an Armstrong number.");
//         }
//         sc.close();
//     }
// }

// in a range
import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input range
        System.out.print("Enter start of range: ");
        int start = sc.nextInt();

        System.out.print("Enter end of range: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        // Loop through all numbers in range
        for (int i = start; i <= end; i++) {
            int original = i;
            int digits = String.valueOf(i).length();
            int sum = 0;
            int temp = i;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.print(original + " ");
            }
        }

        sc.close();
    }
}
