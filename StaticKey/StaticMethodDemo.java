package StaticKey;

class MathUtil {
    static int square(int x) {
        return x * x;
    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {
        System.out.println("Square of 5: " + MathUtil.square(5)); // No object needed
    }
}
