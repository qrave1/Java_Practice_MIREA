package Seven_practice.seventhTask;

public class Magazine implements Printable {
    private String name;


    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    @Override
    public String printMagazines(Printable[] printable){
        for (int i = 0; i < 3; i++){
            System.out.println(printable[i].getName());
        }
        return "";
    }
}
