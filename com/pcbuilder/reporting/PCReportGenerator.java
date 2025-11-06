package com.pcbuilder.reporting;

import com.pcbuilder.core.Cpu;
import com.pcbuilder.core.Hdd;
import com.pcbuilder.core.Keyboard;
import com.pcbuilder.core.Monitors;
import com.pcbuilder.core.Motherboard;
import com.pcbuilder.core.Mouse;
import com.pcbuilder.core.PC;
import com.pcbuilder.core.Ram;
import com.pcbuilder.core.Ssd;
import com.pcbuilder.core.Storage;

public class PCReportGenerator {
    public static void generateReport(PC pc) {
        pc.generateReport();
    }

    public static void main(String[] args) {
        // Required components
        Motherboard mb = new Motherboard(200, "ASUS B550");
        Ram ram = new Ram(100, "16GB DDR4");
        Cpu cpu = new Cpu(300, "Ryzen 5 5600");
        Storage storage = new Ssd(500, "Seagate SSD"); // or: new Hdd(350, "WD Blue HDD");

        PC pc = new PC(mb, ram, cpu, storage);

        // Optional peripherals
        Mouse mouse = new Mouse(50, "Logitech M220");
        Keyboard keyboard = new Keyboard(75, "Corsair K55");
        Monitors monitor = new Monitors(150, "Dell 24\"");

        pc.setMouse(mouse);
        pc.setKeyboard(keyboard);
        pc.setMonitor(monitor);

        // Report and total
        pc.generateReport();
        System.out.println("Total only: " + pc.calculateTotalPrice());
    }
}