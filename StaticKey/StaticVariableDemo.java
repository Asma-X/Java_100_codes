package StaticKey;

class Student {
    String name; // instance variable
    static String college; // static variable (common for all students)

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Name: " + name + ", College: " + college);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {
        Student.college = "JNTU"; // static variable accessed via class name

        Student s1 = new Student("Asma");
        Student s2 = new Student("Fatima");

        s1.display();
        s2.display();
    }
}
