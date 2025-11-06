public class Ram extends MainComponent {
    public Ram (int price, String name) {
        super(price, name);
    }

    public void process () {
        System.out.println("Ram detected");
    }
    public String size(){
        return ("61 gb");
    }
}