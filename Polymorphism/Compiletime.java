package Polymorhism;

class MathUtil {
    // Method overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}

public class Compiletime {
    public static void main(String[] args) {
        MathUtil m = new MathUtil();
        System.out.println(m.add(5, 10)); // int version
        System.out.println(m.add(3.5, 4.5)); // double version
        System.out.println(m.add("Hello ", "Asma")); // String version
    }
}
