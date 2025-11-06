public class PC{
    private CPU cpu;
    private Ram ram;
    private Motherboard mobo;
    private Storage storage;
    public PC(Storage storage){
        cpu=new Cpu(1000,"core i67);
        ram=new Ram(1000,"67 gb ram");
        this.storage=storage;
    }
}