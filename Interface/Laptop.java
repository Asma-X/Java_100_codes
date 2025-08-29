package Interface;

public interface Laptop {

    public void Copy();

    public void Paste();

    public void Print();

    public void Scan();

    default void security() {
        commoncode();
        System.out.println("Laptop: Security features...");
    }

    static void audio() {
        commoncode();
        System.out.println("Laptop: Audio features...");
    }

    private static void commoncode() {
        System.out.println("Laptop: Camera features...");
    }
}
