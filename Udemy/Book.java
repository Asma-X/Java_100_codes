package Udemy;

public class Book {
    int speed;

    void start() {
        System.out.println("Speed: 100 km/h");
    }

    public static void main(String[] args) {
        Book b = new Book();
        Book ducati = new Book();
        Book honda = new Book();
        b.start();

        ducati.speed = 200; // changing the state of an object
        honda.speed = 150; // changing the state of an object

        ducati.speed = 20; // changing the state of an object
        honda.speed = 10; // changing the state of an object

    }
}
