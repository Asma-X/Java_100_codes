package Interface;

public class User {
    public static void main(String[] args) {
        // Laptop l1 = new HP();
        // l1.Copy();
        // l1.Paste();
        // l1.Print();
        // l1.Scan();
        // // l1.Fax(); // not allowed

        Lenova l = new Lenova();
        l.Copy();
        l.Paste();
        l.Print();
        l.Scan();
        l.Camera();

        Laptop.audio(); // static method without object

        HP h = new HP();
        h.Copy();
        h.Paste();
        h.Print();
        h.Scan();
        h.Fax();

        // Until java7 or 1.7 we can't use interface reference to call the methods of
        // the
        // implementing class
        // we can only say what to do but not how to do it
        // we can only use the methods defined in the interface
    }
}
