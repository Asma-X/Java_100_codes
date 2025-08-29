// // using for loop
// public class SumOfNums {
//     public static void main(String[] args) {
//         int num=10;
//         int sum=0;
//         for(int i=1;i<=num;i++){
//             sum+=i;
//         }
//         System.out.println("The sum of first "+num+" natural numbers is: "+sum);
//     }
// }

// // using formulae

// public class SumOfNums {

//     public static void main(String[] args) {
//         int num = 10;
//         int sum = (num * (num + 1)) / 2;
//         System.out.println("The sum of first " + num + " natural numbers is: " + sum);
//     }
// }

// Using recursion

import java.util.Scanner;

public class SumOfNums {

    public static void main(String[] args) {

        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("enter a positive number");
        } else {
            int sum = getSum(n);
            System.out.println(sum);
        }
        sc.close();
    }

    static int getSum(int n) {
        if (n == 0)
            return 0;
        return n + getSum(n - 1);
    }
}