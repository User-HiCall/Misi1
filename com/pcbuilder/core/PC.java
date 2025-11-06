package com.pcbuilder.core;

public class PC {
    private final Motherboard motherboard;
    private final Ram ram;
    private final Cpu cpu;
    private final Storage storage; // exactly one: Hdd or Ssd

    // optional peripherals
    private Mouse mouse;
    private Keyboard keyboard;
    private Monitors monitor;

    public PC(Motherboard motherboard, Ram ram, Cpu cpu, Storage storage) {
        if (motherboard == null || ram == null || cpu == null || storage == null) {
            throw new IllegalArgumentException("Motherboard, RAM, CPU, and one Storage are required.");
        }
        this.motherboard = motherboard;
        this.ram = ram;
        this.cpu = cpu;
        this.storage = storage;
    }

    // Optional peripherals setters
    public void setMouse(Mouse mouse) { this.mouse = mouse; }
    public void setKeyboard(Keyboard keyboard) { this.keyboard = keyboard; }
    public void setMonitor(Monitors monitor) { this.monitor = monitor; }

    // Back-compat with previous calls
    public void useMouse(Mouse mouse) { setMouse(mouse); }
    public void useKeyboard(Keyboard keyboard) { setKeyboard(keyboard); }
    public void useMonitor(Monitors monitor) { setMonitor(monitor); }

    // Total price = required + any present optional
    public int calculateTotalPrice() {
        int total = motherboard.getPrice() + ram.getPrice() + cpu.getPrice() + storage.getPrice();
        if (mouse != null) total += mouse.getPrice();
        if (keyboard != null) total += keyboard.getPrice();
        if (monitor != null) total += monitor.getPrice();
        return total;
    }

    // Back-compat overload (updates optional peripherals if provided)
    public int calculateTotalPrice(Mouse mouse, Monitors monitor, Keyboard keyboard) {
        if (mouse != null) this.mouse = mouse;
        if (monitor != null) this.monitor = monitor;
        if (keyboard != null) this.keyboard = keyboard;
        return calculateTotalPrice();
    }

    public void generateReport() {
        System.out.println("-- PC Report --");
        System.out.println("Motherboard: " + motherboard.getName() + " (" + motherboard.getPrice() + ")");
        System.out.println("RAM: " + ram.getName() + " (" + ram.getPrice() + ")");
        System.out.println("CPU: " + cpu.getName() + " (" + cpu.getPrice() + ")");
        System.out.println("Storage: " + storage.getName() + " (" + storage.getPrice() + ")");
        System.out.println("Mouse: " + (mouse != null ? mouse.getName() + " (" + mouse.getPrice() + ")" : "none"));
        System.out.println("Keyboard: " + (keyboard != null ? keyboard.getName() + " (" + keyboard.getPrice() + ")" : "none"));
        System.out.println("Monitor: " + (monitor != null ? monitor.getName() + " (" + monitor.getPrice() + ")" : "none"));
        System.out.println("Total price: " + calculateTotalPrice());
    }
}