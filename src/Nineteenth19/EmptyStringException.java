package Nineteenth19;

public class EmptyStringException extends IllegalArgumentException{
    public EmptyStringException(){
        super("An empty string passed!");
    }

}
