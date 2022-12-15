package Twelve_practice.Gif;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Gif");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000, 700));
        frame.setMinimumSize(new Dimension(1000, 700));
        JPanel image_panel = new JPanel();
        JLabel img = new JLabel();
        image_panel.add(img);
        frame.getContentPane().add(image_panel);
        frame.pack();
        frame.setVisible(true);

        while (true){
            for (int i = 0; i <= 47; i++) {
                img.setIcon(new ImageIcon("C:\\Users\\livea\\IdeaProjects\\Java_Practice_MIREA\\src\\Twelve_practice\\Gif\\frame_"+i+"_delay-0.03s.gif"));
                Thread.sleep(30);
            }
        }
    }
}