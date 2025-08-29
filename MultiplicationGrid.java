public class MultiplicationGrid {
    public static void main(String[] args) {
        int range = 10;

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= range; j++) {
                System.out.printf("%4d", i * j); // formatted with spacing
            }
            System.out.println();
        }
    }
}
