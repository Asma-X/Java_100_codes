// public class Sumrange {
//     public static void main(String[] args) {
//         int a = 5;
//         int b = 10;

//         int sum = 0;
//         for (int i = a; i <= b; i++)
//             sum = sum + i;
//         System.out.println("The sum is " + sum);
//     }
// }

public class Sumrange {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        // int sum = (b * (b + 1)) / 2 - ((a - 1) * a) / 2;
        int sum = ((b - 1) * b) / 2 - (a * (a + 1)) / 2;
        System.out.println("The sum is " + sum);
    }
}