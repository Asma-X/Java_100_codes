// ✅ Upcasting
// Converting subclass reference → superclass reference (always safe).
// Enables runtime polymorphism.

// ✅ Downcasting
// Converting superclass reference → subclass reference.
// Must be done carefully with instanceof check.

package Polymorphism;

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void wagTail() {
        System.out.println("Dog is wagging tail 🐕");
    }
}

public class UpcastDowncastDemo {
    public static void main(String[] args) {
        // ✅ Upcasting (Dog → Animal)
        Animal a = new Dog(); // Upcast
        a.sound(); // Output: Dog barks (runtime polymorphism)

        // a.wagTail(); // ❌ Not accessible through Animal reference

        // ✅ Downcasting (Animal → Dog)
        if (a instanceof Dog) { // Always check before casting
            Dog d = (Dog) a; // Downcast
            d.wagTail(); // Output: Dog is wagging tail 🐕
        } else {
            System.out.println("Not a Dog instance");
        }
    }
}
