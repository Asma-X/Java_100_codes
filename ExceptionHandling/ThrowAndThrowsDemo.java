package ExceptionHandling;

class VotingSystem {

    // Method declares it may throw an exception
    void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            // Actually throwing the exception
            throw new ArithmeticException("❌ You are not eligible to vote");
        } else {
            System.out.println("✅ You can vote!");
        }
    }
}

public class ThrowAndThrowsDemo {
    public static void main(String[] args) {
        VotingSystem vs = new VotingSystem();

        try {
            vs.checkAge(15); // risky call
            System.out.println("Rest of the code...");
        } catch (ArithmeticException e) {
            System.out.println("⚠️ Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues smoothly...");
    }
}
