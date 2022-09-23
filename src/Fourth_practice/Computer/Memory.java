package Fourth_practice.Computer;

public class Memory {
    private double frequency;
    private int amountOfMemory;

    public Memory(double frequency, int amountOfMemory) {
        this.frequency = frequency;
        this.amountOfMemory = amountOfMemory;
    }

    public double getFrequency() {
        return frequency;
    }

    public int getAmountOfMemory() {
        return amountOfMemory;
    }
    public void cleaning(){
        System.out.println("HDD has 1000gb");
    }
}
