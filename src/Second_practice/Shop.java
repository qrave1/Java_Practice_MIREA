package Second_practice;

import java.util.ArrayList;

public class Shop {
    private String address;
    public ArrayList<Computer> storage = new ArrayList<>();

    public Shop(String address) {
        this.address = address;
    }

    void setArr(ArrayList<Computer> list) {this.storage = list;}
    void AddComputer(int index,int id, String CPU, String GPU, String MEM){
        Computer a = new Computer(id,CPU,GPU,MEM);
        storage.add(index, a);
    }

    public void deleteComputer(int index){
        for(int j = 0; j < storage.size(); j++){
            if(storage.get(j).id == index){
                storage.remove(j);
                break;
            }
        }
        System.out.println("Object has been deleted from base");
    }



    public void find(int index){
        for (int j = 0; j < storage.size(); j++) {
            if(storage.get(j).id == index){
                System.out.println(storage.get(j).toString());
            }
            else{
                System.out.println("Computer wasn't found in base");
            }
        }
    }
}
