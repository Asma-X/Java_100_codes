package Interface;

public class HP implements Laptop {
    @Override
    public void Copy() {
        System.out.println("HP: Copying...");
    }

    @Override
    public void Paste() {
        System.out.println("HP: Pasting...");
    }

    @Override
    public void Print() {
        System.out.println("HP: Printing...");
    }

    @Override
    public void Scan() {
        System.out.println("HP: Scanning...");
    }

    public void Fax() {
        System.out.println("HP: Faxing...");
    }

}
