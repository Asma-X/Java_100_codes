import java.util.Scanner;

public class Q4Modified {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your roll number: ");
        int roll = sc.nextInt();
        sc.nextLine(); // Fix newline (because nextInt leaves it)

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your CGPA (double): ");
        double cgpa = sc.nextDouble();

        System.out.print("Enter your attendance percentage (float): ");
        float attendance = sc.nextFloat();

        System.out.println("\nStudent Details:");
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Attendance: " + attendance + "%");

        sc.close();
    }
}
