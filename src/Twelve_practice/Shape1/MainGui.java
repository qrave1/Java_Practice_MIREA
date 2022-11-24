package Twelve_practice.Shape1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class MainGui {
    private final Button addButton;
    private JFrame frame;
    private DrawerPanel drawerPanel;

    public static void main(String[] args) {
        MainGui app = new MainGui();
        app.start();
    }

    public MainGui(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(800, 600);

        drawerPanel = new DrawerPanel();
        drawerPanel.setSize(800, 600);

        Container mainContainer = frame.getContentPane();
        mainContainer.setLayout(new BorderLayout());

        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1, 3));
        bottomPanel.setSize(400, 30);

        mainContainer.add(bottomPanel, BorderLayout.SOUTH);
        mainContainer.add(drawerPanel, BorderLayout.CENTER);

        addButton = new Button("Start");
        addButton.addActionListener(e -> onStartClick());
        bottomPanel.add(addButton);

    }

    private void onStartClick() {
        Random rand = new Random();
        for(int i = 0; i < 20; i++){
            int n  = rand.nextInt(3);
            if(n==0){
                drawerPanel.addRectangle();
            }else if(n == 1){
                drawerPanel.addCircle();
            }
            else {
                drawerPanel.addOval();
            }
        }
        drawerPanel.repaint();
    }

    private void start() {
        frame.setVisible(true);
    }

}