package StaticKey;

class Demo {
    static int x;

    static {
        x = 10;
        System.out.println("Static Block Executed! x = " + x);
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) {
        System.out.println("Accessing Demo.x: " + Demo.x);
    }
}
