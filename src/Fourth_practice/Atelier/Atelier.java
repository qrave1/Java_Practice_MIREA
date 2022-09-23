package Fourth_practice.Atelier;

public class Atelier {
    public void menGo2(Clothes[] array) {
        for (Clothes clothes : array) {
            System.out.println(clothes);
            System.out.println(clothes.go());
        }
    }
}
