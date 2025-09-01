package Polymorhism;

class Animal {
    void sound() {
        System.out.println("some sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("bark");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Animal a = new Dog(); // upcasting
        a.sound(); // prints "bark" — runtime polymorphism
    }
}
