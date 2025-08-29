package Inheritance;

public class Admin extends Developer {
    public void manage() {
        // read();
        super.read();
        write();
        System.out.println("Admin manage access.");
    }

    public void read() {
        System.out.println("Admin read access.");
    }
}
