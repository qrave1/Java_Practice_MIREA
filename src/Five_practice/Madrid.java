package Five_practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Madrid {
    int a = 0;
    int b = 0;
    JLabel label1;
    JLabel label2;
    Label label3;
    Label label4;
    JFrame frame;
    JPanel panel;


    public Madrid() {
        frame = new JFrame("Football");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        panel = new JPanel();
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(400, 300));

        JButton button1 = new JButton("AC Milan");
        JButton button2 = new JButton("Real Madrid");

        label1 = new JLabel("Result: 0 X 0", JLabel.LEADING);
        label1.setPreferredSize(new Dimension(250, 30));

        label2 = new JLabel("Last Scorer: N/A", JLabel.LEADING);
        label2.setPreferredSize(new Dimension(250, 30));

        label3 = new Label("Winner: ");
        label3.setPreferredSize(new Dimension(250, 30));

        label4 = new Label();
        label4.setPreferredSize(new Dimension(250, 30));

        //То, что делают кнопки
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                a++;
                label1.setText("Result: " + a + " X " + b);
                label2.setText("Last scorer: AC Milan");
                if (a >= 10) {
                    label3.setText("Winner: AC Milan");
                    label4.setText("Game is over!");
                }
            }
        });

        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                b++;
                label1.setText("Result: " + a + " X " + b);
                label2.setText("Last scorer: Real Madrid");
                if (b >= 10) {
                    label3.setText("Winner: Real Madrid");
                    label4.setText("Game is over!");
                }
            }
        });


        panel.add(button1);
        panel.add(button2);
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        panel.add(label4);

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);

    }

}

