package Inheritance.Inheritance2;

// // single inheritance

// class Animal {
//     void eat() { System.out.println("Eating..."); }
// }
// class Dog extends Animal {
//     void bark() { System.out.println("Barking..."); }
// }
// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();  // inherited
//         d.bark(); // child method
//     }
// }

// multi-level inheritance
// class Animal {
//     void eat() {
//         System.out.println("Eating...");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barking...");
//     }
// }

// class Puppy extends Dog {
//     void weep() {
//         System.out.println("Weeping...");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Puppy p = new Puppy();
//         p.eat();
//         p.bark();
//         p.weep();
//     }
// }

// // Hierarchical inheritance
// class Animal {
//     void eat() {
//         System.out.println("Eating...");
//     }
// }

// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barking...");
//     }
// }

// class Cat extends Animal {
//     void meow() {
//         System.out.println("Meowing...");
//     }
// }

// public class Main {
//     public static void main(String[] args) {
//         Dog d = new Dog();
//         d.eat();
//         d.bark();

//         Cat c = new Cat();
//         c.eat();
//         c.meow();
//     }
// }

// multiple inheritance using interfaces
interface A {
    void show();
}

interface B {
    void display();
}

class C implements A, B {
    public void show() {
        System.out.println("Show from A");
    }

    public void display() {
        System.out.println("Display from B");
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}
