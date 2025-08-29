public class TypeCastingExample {
    public static void main(String[] args) {

        // 1. Implicit Casting (Widening Conversion)
        int numInt = 100; // int is 4 bytes
        double numDouble = numInt; // int → double (8 bytes)
        System.out.println("Implicit Casting (int to double): " + numDouble);

        // 2. Explicit Casting (Narrowing Conversion)
        double pi = 3.14159; // double is 8 bytes
        int approxPi = (int) pi; // double → int (manual cast, fractional part lost)
        System.out.println("Explicit Casting (double to int): " + approxPi);

        // 3. Char to Int (ASCII values)
        char letter = 'A'; // 'A' has ASCII code 65
        int asciiValue = letter; // implicit casting (char → int)
        System.out.println("Char 'A' to int: " + asciiValue);

        // 4. Int to Char (Reverse)
        int code = 66;
        char letterB = (char) code; // explicit casting
        System.out.println("Int 66 to char: " + letterB);
    }
}
