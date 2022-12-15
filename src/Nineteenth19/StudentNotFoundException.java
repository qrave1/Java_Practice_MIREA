package Nineteenth19;

public class StudentNotFoundException extends Exception{
    public StudentNotFoundException(String name){
        super("Student with FIO : " + name + " not found");
    }
}
