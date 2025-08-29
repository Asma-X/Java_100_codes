public class VariableTypesDemo {

    // Instance variables (per object)
    int instanceVar; // default 0
    String owner; // default null

    // Static variable (shared)
    static String course = "Placement Prep"; // default set explicitly

    // Constructor (parameters are local variables)
    public VariableTypesDemo(String owner) {
        this.owner = owner; // 'owner' (local param) -> instance field
    }

    void instanceMethod() {
        int localVar = 100; // local variable
        System.out.println("localVar = " + localVar);
        System.out.println("instanceVar = " + instanceVar);
        System.out.println("owner = " + owner);
        System.out.println("static course = " + VariableTypesDemo.course);
    }

    static void staticMethod() {
        // System.out.println(instanceVar); // ❌ can't access instance in static
        System.out.println("static course (from staticMethod) = " + course);
    }

    public static void main(String[] args) {
        VariableTypesDemo a = new VariableTypesDemo("Asma");
        VariableTypesDemo b = new VariableTypesDemo("Zoya");

        a.instanceVar = 10; // only affects 'a'
        b.instanceVar = 20; // only affects 'b'

        // Update static for all
        VariableTypesDemo.course = "Java + DSA";

        a.instanceMethod();
        b.instanceMethod();
        VariableTypesDemo.staticMethod();

        System.out.println("a.instanceVar = " + a.instanceVar); // 10
        System.out.println("b.instanceVar = " + b.instanceVar); // 20
        System.out.println("VariableTypesDemo.course = " + VariableTypesDemo.course); // shared
    }
}
