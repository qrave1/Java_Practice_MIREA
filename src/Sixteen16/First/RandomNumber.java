package Sixteen16.First;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.JOptionPane.showMessageDialog;

public class RandomNumber implements ActionListener {

    private static JLabel text;
    private static JLabel correct;
    private static JLabel counter;
    private static JTextField number;
    private static JButton btn;
    private static int rndNum;

    private int chance=3;


    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(panel);
        panel.setLayout(null);

        text = new JLabel("����� �����(�� 0 - 20) ������� � �������(�  ��� 3 �������!!!!!)");
        text.setBounds(10,-30,600,100);
        panel.add(text);

        number = new JTextField();
        number.setBounds(10,40,90,20);
        panel.add(number);

        btn = new JButton("SEND");
        btn.setBounds(10,70,80,20);
        btn.addActionListener(new RandomNumber());
        panel.add(btn);

        correct = new JLabel();
        correct.setBounds(50,90,500,30);
        panel.add(correct);

        counter = new JLabel();
        counter.setBounds(50,110,400,30);
        panel.add(counter);


        frame.setVisible(true);
        int max = 20;
        rndNum = rnd(max);
        System.out.println(rndNum);
    }

    public static int rnd(int max){
        return (int) (Math.random() * max);
    }

    public void loseGame(){
        showMessageDialog(null, "�� ��������");
        System.exit(0);
    }

    public void winGame(){
        showMessageDialog(null, "��� �� �������");
        System.exit(0);
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        if(chance > 1){
            String message = "";
            try{
                int num = Integer.parseInt(number.getText());
                if(num == rndNum) {
                    message += "�� �������";
                    correct.setText(message);
                    winGame();
                }
                else if (num < rndNum) {
                    message += "���� ����� ������ �����������";


                }
                else {
                    message += "���� ����� ������ �����������";

                }
                chance--;


            }catch (Exception ex){
                message = "������ ���� ��� �� �����! ������� ����� ����� �� 0 �� 20.";
            }
            finally {
                correct.setText(message);
                counter.setText("� ���� �������� �������: " + chance);
            }


        }
        else{
            chance--;
            counter.setText("� ���� �������� �������: " + chance);
            loseGame();
        }


    }
}
