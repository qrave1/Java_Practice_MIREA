package Twelve_practice.Shape1;

import java.awt.*;

class Rectangle extends Shape {
    @Override
    public void draw(Graphics g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
    }
}
