class Student {
    String name;
    int age;
    double cgpa;

    // 1. Using this to differentiate instance variable and local variable
    Student(String name, int age, double cgpa) {
        this.name = name; // "this" refers to the current object
        this.age = age;
        this.cgpa = cgpa;
    }

    // 2. Using this to call another constructor
    Student(String name, int age) {
        this(name, age, 0.0); // Calls the above constructor
    }

    // 3. Using this to call current class method
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("CGPA: " + this.cgpa);
    }

    // 4. Using this as a method parameter
    void updateCGPA(double cgpa) {
        this.cgpa = cgpa; // "this" ensures we update current object’s cgpa
    }

    // 5. Using this to pass object as argument
    void compare(Student other) {
        if (this.cgpa > other.cgpa) {
            System.out.println(this.name + " has higher CGPA than " + other.name);
        } else if (this.cgpa < other.cgpa) {
            System.out.println(other.name + " has higher CGPA than " + this.name);
        } else {
            System.out.println(this.name + " and " + other.name + " have equal CGPA");
        }
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        // Constructor with 3 params
        Student s1 = new Student("Asma", 21, 8.5);

        // Constructor with 2 params (calls another constructor using this)
        Student s2 = new Student("Ayesha", 20);

        // Display student details
        s1.display();
        s2.display();

        // Update CGPA using "this"
        s2.updateCGPA(9.0);

        System.out.println("\nAfter updating CGPA:");
        s2.display();

        // Compare students using "this"
        s1.compare(s2);
    }
}