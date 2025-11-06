package com.pcbuilder.reporting;

import com.pcbuilder.core.PC;
import com.pcbuilder.core.Ssd;
import com.pcbuilder.core.Storage;

public class PCReportGenerator {
    public static void generateReport(PC pc) {
        pc.generateReport();

    }
    public static void main(String[] args) {
        Storage ssd= new Ssd(500, "seagate ssd");
        PC pc=new PC(ssd);

        pc.generateReport();
        pc.useMouse(null);
        pc.useMonitor(null);
        pc.useKeyboard(null);
        pc.calculateTotalPrice(null, null, null);
        System.out.println(""+);
    }
}
