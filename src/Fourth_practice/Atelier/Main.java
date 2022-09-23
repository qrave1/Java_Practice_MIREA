package Fourth_practice.Atelier;

public class Main {
    public static void main(String[] args) {


        Clothes[] array = {
                new TShirt(Studio.XXS, 2000, "Green"),
                new Pants(Studio.S, 3000, "Blue"),
                new Skirt(Studio.L, 1500, "Pink"),
                new Tie(Studio.M, 600, "Black")
        };
        new Atelier().menGo2(array);
    }
}
