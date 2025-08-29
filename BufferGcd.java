import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferGcd {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("enter a number");
        int num1 = Integer.parseInt(br.readLine());

        System.out.println("enter a number");
        int num2 = Integer.parseInt(br.readLine());

        int gcd = findgcd(num1, num2);
        System.out.println(gcd);

    }

    static int findgcd(int a, int b) {
        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }

        }
        if (a == 0) {
            return b;
        }
        return a;

    }
}
