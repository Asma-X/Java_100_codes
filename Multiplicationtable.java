public class Multiplicationtable {
    public static void main(String[] args) {
        int number = 5; // You can change this to generate a table for a different number
        System.out.println("Multiplication Table for " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}