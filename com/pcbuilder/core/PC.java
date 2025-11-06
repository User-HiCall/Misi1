package com.pcbuilder.core;
public class PC {
    private Cpu cpu;
    private Ram ram;
    private Motherboard motherboard;
    private Storage storage;

    public PC(Storage storage) {
        cpu = new Cpu(1000, "core i67");
        ram = new Ram(1000, "61 gb ram");
        this.storage = storage;
    }

    public int calculateTotalPrice(Mouse mouse, Keyboard keyboard, Monitors monitors) {
        return (cpu.price + ram.price + motherboard.price + keyboard.price + monitors.price + storage.price + mouse.price);
    }

    public void useMouse(Mouse mouse) {
        mouse.run();
    }

    public void useMonitor(Monitors monitors) {
        monitors.run();
    }

    public void useKeyboard(Keyboard keyboard) {
        keyboard.run();
    }

    public Cpu getCPU(){
        return cpu;
    }
    public Motherboard getMotherboard() {
        return motherboard;
    }
    public void generateReport() {
        System.out.println("--- PC Build Report ---");
        System.out.println("CPU: " + this.getCPU().getName());
        System.out.println("Motherboard: " + this.getMotherboard().getName());
        System.out.println("RAM Sticks: " + this.ram.size());
        System.out.println("-----------------------");
    }

}