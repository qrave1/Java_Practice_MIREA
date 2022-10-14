package Six_practice.tenthTask;


import java.util.ArrayList;
import java.util.Arrays;

public class Shop {
    private String name;
    private ArrayList<String> arrayList = new ArrayList<>();

    //Импорт массива из main в Shop
    public void setArr(ArrayList <String> arrayList) {
        this.arrayList = arrayList;
    }

    //Вывод массива
    public void printArr(){
        if(!arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
        }
        else{
            System.out.println("the array has no elements.");
        }
    }

    //Добавление элемент в массив
    public void addElement(String name){
        arrayList.add(name);
    }

    //Удаление элемента из массива
    public void removeElement(String name){
        arrayList.remove(name);
    }

    //Поиск элемента в массиве
    public void findElement(String name){
        if(arrayList.indexOf(name) == -1){
            System.out.println("this element is not in the list.");
        }
        else{
            System.out.println(arrayList.indexOf(name));
        }
    }

    public void printBrands(){
        ComputerBrand[] computerBrand = ComputerBrand.values();
        System.out.println(Arrays.toString(computerBrand));
    }

}
