package abstractclass;

abstract class Animal {
    abstract void sound(); // must be implemented

    void eat() { // already implemented
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    @Override
    void sound() { // ✅ MUST implement
        System.out.println("Bark Bark!");
    }

    // eat() is already implemented in Animal,
    // overriding it here is OPTIONAL
    @Override
    void eat() {
        System.out.println("Dog eating...");
    }
}

public class Test {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound(); // Bark Bark!
        d.eat(); // Dog eating...
    }
}
