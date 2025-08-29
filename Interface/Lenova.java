package Interface;

public class Lenova implements Laptop {

    @Override
    public void Copy() {
        System.out.println("Lenovo: Copying...");
    }

    @Override
    public void Paste() {
        System.out.println("Lenovo: Pasting...");
    }

    @Override
    public void Print() {
        System.out.println("Lenovo: Printing...");
    }

    @Override
    public void Scan() {
        System.out.println("Lenovo: Scanning...");
    }

    public void Camera() {
        System.out.println("Lenovo: Taking a photo...");
    }
}
