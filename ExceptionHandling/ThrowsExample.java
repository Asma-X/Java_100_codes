package ExceptionHandling;

import java.io.*;

public class ThrowsExample {
    // Declaring that this method may throw IOException
    static void readFile() throws IOException {
        FileReader fr = new FileReader("file.txt"); // 🚨 risky code
        BufferedReader br = new BufferedReader(fr);
        System.out.println(br.readLine());
    }

    public static void main(String[] args) {
        try {
            readFile(); // must handle IOException
        } catch (IOException e) {
            System.out.println("Handled IOException: " + e);
        }
    }
}
