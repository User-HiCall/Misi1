import javax.management.monitor.Monitor;

public class PC{
    private Cpu cpu;
    private Ram ram;
    private Motherboard mobo;
    private Storage storage;
    public PC(Storage storage){
        cpu=new Cpu(1000,"core i67");
        ram=new Ram(1000,"61 gb ram");
        this.storage=storage;
    }
    public void calculateTotalPrice(Mouse mouse,Keyboard keyboard,Monitor monitor){
        return (cpu.price+ram.price+mobo.price+keyboard.price+monitor.price+storage.price+mouse.price);        
    }
    public void useMouse(Mouse mouse){
        mouse.run();
    }
    public void useMonitor(Monitor monitor){
        monitor.run();
    }
    public void useKeyboard (Keyboard keyboard){
        keyboard.run();
    }
}