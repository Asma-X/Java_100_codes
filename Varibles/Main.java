package Varibles;

class Demo {
    int a = 5; // Instance variable
    static int b = 10; // Static variable

    static void display() {
        // System.out.println(a); // ❌ ERROR: cannot make a static reference to
        // non-static variable a
        System.out.println("Static variable b = " + b); // ✅ Works
    }
}

public class Main {
    public static void main(String[] args) {
        Demo.display(); // Call static method

        // ✅ To access 'a', we need an object
        Demo obj = new Demo();
        System.out.println("Instance variable a = " + obj.a);
    }
}
