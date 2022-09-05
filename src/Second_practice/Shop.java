package Second_practice;

public class Shop {
    private String address;
    public Computer[] storage;
    private static int i = 0;

    public Shop(String address) {
        this.address = address;
        this.storage = null;
    }

    private void AddComputer(int id, String CPU, String GPU, String MEM){
        Computer a = new Computer(id,CPU,GPU,MEM);
        storage[i] = a;
    }

    private void deleteComputer(int index){
        for(int j = 0; j < storage.length; j++){
            if(storage[j].id == index)
                storage[j] = null;
        }
    }

    private void search(int index){
        for(int j = 0; j < storage.length; j++){
            if(storage[j].id == index)
                System.out.println(storage[j]);
        }
    }

}
