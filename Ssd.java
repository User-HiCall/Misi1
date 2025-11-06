public class Ssd extends Storage {
    public Ssd(int price,String name){
        super(price,name);
    }
    public void store() {
        System.out.println("simpan ke ssd");
    }
}