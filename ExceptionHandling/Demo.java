package ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Program execution started");
        int fnumber = 9;
        int snumber = 0;
        int result = 0;

        try {
            result = fnumber / snumber;
            File file = new File("test.txt");
            FileInputStream fis = new FileInputStream(file);
            System.out.println(fis);

        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            throw e;
        }

        finally {
            System.out.println("finally block");
        }
        System.out.println(result);
        System.out.println("Program execution ended");
    }

}
