package Twelve_practice.Shape1;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawerPanel extends JPanel {
    ArrayList<Shape> shapes = new ArrayList<Shape>();

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        setDoubleBuffered(true);
        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public void addRectangle() {
        Rectangle rectangle = new Rectangle();
        rectangle.randomFill();
        shapes.add(rectangle);
    }

    public void addCircle() {
        Circle circle = new Circle();
        circle.randomFill();
        shapes.add(circle);
    }
    public void addOval() {
        Oval oval = new Oval();
        oval.randomFill();
        shapes.add(oval);
    }

}

