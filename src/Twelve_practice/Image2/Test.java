package Twelve_practice.Image2;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Third Task");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000,1000);
        JPanel image_panel = new JPanel();
        //Именно здесь осуществлён вывод файла из аргументов
        JLabel img = new JLabel( new ImageIcon(args [0]));
        image_panel.add(img);
        frame.getContentPane().add(image_panel);
        frame.pack();
        frame.setVisible(true);

    }
}
