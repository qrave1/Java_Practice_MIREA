package Second_practice;

import java.util.ArrayList;

public class Shop {
    private String address;
    public ArrayList<Computer> storage;
    private static int i = 0;

    public Shop(String address) {
        this.address = address;
    }

    void AddComputer(int id, String CPU, String GPU, String MEM){
        Computer a = new Computer(id,CPU,GPU,MEM);
        storage.add(i, a);
        i++;
    }

    void deleteComputer(int index){
        for(int j = 0; j < storage.size(); j++){
            if(storage.get(j).id == index){
                storage.remove(j);
                break;
            }
        }
        System.out.println("Object has been deleted from base");
    }

    void search(int index){
        for(int j = 0; j < storage.size(); j++){
            if(storage.get(j).id == index){
                System.out.println("Computer has been found in base");
                break;
            }
            else {
                System.out.println("Computer is missing in base");
                break;
            }
        }
    }
}
