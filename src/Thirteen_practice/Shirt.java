package Thirteen_practice;

public class Shirt {
    private String name = "";
    private String type = "";
    private String color = "";
    private String size = "";

    public Shirt(String name, String type, String color, String size) {
        this.name = name;
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public Shirt() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Shirt " +
                "name = '" + name + '\'' +
                ", type = '" + type + '\'' +
                ", color = '" + color + '\'' +
                ", size = '" + size + '\'' +
                '}';
    }
}
