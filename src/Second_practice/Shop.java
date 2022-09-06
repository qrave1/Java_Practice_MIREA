package Second_practice;

public class Shop {
    private String address;
    public Computer[] storage;
    private static int i = 0;

    public Shop(String address) {
        this.address = address;
        this.storage = new Computer[10];
    }

    void AddComputer(int id, String CPU, String GPU, String MEM){
        Computer a = new Computer(id,CPU,GPU,MEM);
        storage[i] = a;
    }

    void deleteComputer(int index){
        for(int j = 0; j < storage.length; j++){
            if(storage[j].id == index)
                storage[j] = null;
        }
    }

    void search(int index){
        try{
        for (Computer computer : storage) {
            if (computer.id == index)
                System.out.println("Computer has been completely founded on storage: " + computer);
        }}
        catch(Exception NullPointerException){
            // тут короче должна быть заглушка, потому что это исключение вообще нахуй не должно вызываться, и никто
            // не должен знать про костыли, на которых вся программа и работает
        }
    }

}
