package Twelve_practice.Shape1;


import java.awt.*;
import java.util.Random;
public abstract class Shape {
    public int x, y;
    public int width, height;
    public Color color = Color.RED;

    //Случайная позиция фигуры
    public int rand_pos(int min, int max) {
        Random random = new Random();
        return min + random.nextInt(max - min);
    }

    //Случайный цвет фигуры
    public Color randomColor() {
        Color[] colors = new Color[]{new Color(0, 255, 0), new Color(0, 255, 255), new Color(0, 169, 255),
                new Color(106, 0, 255), new Color(200, 50, 255), new Color(255, 60, 200), new Color(255, 80, 80),
                new Color(50,50,100), new Color(100,0,10), new Color(0,200,250), new Color(123,123,123)};
        return colors[rand_pos(0, colors.length)];
    }

    public void randomFill() {
        this.x = rand_pos(0, 1550);
        this.y = rand_pos(0,820);
        this.width = rand_pos(5, 100);
        this.height = rand_pos(5, 100);
        this.color = randomColor();
    }

    public void draw(Graphics g) {

    }
}



