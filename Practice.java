public class Practice {

    public void print() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d=%d", 5, i, 5 * i).println();
        }
    }

    public void print(int table) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d*%d=%d", table, i, table * i).println();
        }
    }

    public void print(int table, int from, int to) {
        for (int i = from; i <= to; i++) {
            System.out.printf("%d*%d=%d", table, i, table * i).println();
        }
    }

    public static void main(String[] args) {
        Practice p = new Practice();
        // p.print();
        // p.print(7);
        p.print(5, 1, 5);
    }

}
