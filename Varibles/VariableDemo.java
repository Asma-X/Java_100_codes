package Varibles;

class Student {
    // Instance variables
    String name; // default = null
    int age; // default = 0

    void setDetails(String name, int age) {
        // Local variables
        String college = "JNTU"; // local to this method
        this.name = name; // differentiating with "this"
        this.age = age;

        System.out.println("College: " + college); // local variable usage
    }

    void display() {
        // Here, college is not accessible (scope ended)
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class VariableDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Using method with local variables
        s1.setDetails("Asma", 21);

        // Instance variables persist as long as object exists
        s1.display();
    }
}
