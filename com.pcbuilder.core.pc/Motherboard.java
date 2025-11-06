public class Motherboard extends MainComponent {
    public Motherboard(int price, String name) {
        super(price, name);
    }

    public void process() {
        System.out.println("Motherboard Attached");
    }
}