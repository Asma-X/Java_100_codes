package Inheritance;

public class User {
    public static void main(String[] args) {
        Guest guest = new Guest();
        guest.read();

        Developer developer = new Developer();
        developer.read();
        developer.write();

        Admin admin = new Admin();
        admin.read();
        admin.write();
        admin.manage();
    }

}
