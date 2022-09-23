package Fourth_practice.Computer;

import java.util.Arrays;

public class Computer {
    public static void main(String[] args) {
        Processor processor = new Processor(3.7);
        Memory memory = new Memory(4.5, 16);
        Monitor monitor = new Monitor(27, 144);
        ComputerBrand[] computerBrand = ComputerBrand.values();
        System.out.println("all computer brands:");
        System.out.println(Arrays.toString(computerBrand));
        monitor.turnOn();
        memory.cleaning();
    }
}
