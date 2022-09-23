package Fourth_First_practice.Second;

public class Phone {
    private int number;
    private double weight;
    private String model;

    public Phone() {
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, double weight, String model) {
        this.number = number;
        this.weight = weight;
        this.model = model;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumber() {
        return number;
    }

    public double getWeight() {
        return weight;
    }

    public String getModel() {
        return model;
    }

    public void receiveCall(int number) {
        System.out.println(number + " is calling.");
    }

    public void receiveCall(int number, String name) {
        System.out.println("Name: " + name + " " + number + " is calling.");
    }

    public void sendMessage(int number) {
        System.out.println("Message will sent to: " + number);
    }

    @Override
    public String toString() {
        return "Phone " +
                "number = " + number +
                ", weight = " + weight +
                ", model = '" + model + '\'';
    }
}
