import java.util.Scanner;

public class ScannerSum {

    static int findsum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a first number");
        int num1 = sc.nextInt();

        System.out.print("enter a second number");
        int num2 = sc.nextInt();

        int sum = findsum(num1, num2);

        System.out.println(sum);
        sc.close();
    }
}
