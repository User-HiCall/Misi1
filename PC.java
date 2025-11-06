
public class PC{
    private String name;
    private Cpu cpu;
    private Ram ram;
    private Motherboard mobo;
    private Storage storage;
    public PC(String name,Storage storage){
        this.name=name;
        cpu=new Cpu(1000,"core i67");
        ram=new Ram(1000,"61 gb ram");
        this.storage=storage;
    }
    public int calculateTotalPrice(Mouse mouse,Keyboard keyboard,Monitors monitors){
        return (cpu.price+ram.price+mobo.price+keyboard.price+monitors.price+storage.price+mouse.price);        
    }
    public void useMouse(Mouse mouse){
        mouse.run();
    }
    public void useMonitor(Monitors monitors){
        monitors.run();
    }
    public void useKeyboard (Keyboard keyboard){
        keyboard.run();
    }
    public String getName(){
        return name;
    }
}