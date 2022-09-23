package Fourth_First_practice.First;

public class Shape {
    private String type = "Shape";
    public String getType(){
        return type;
    }

    @Override
    public String toString() {
        return "Shape " +
                "type = '" + type + '\'';
    }
}
