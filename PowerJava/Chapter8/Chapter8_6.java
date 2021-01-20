package javaTest.PowerJava.Chapter8;

import javax.swing.*;
import java.awt.*;

public class Chapter8_6 extends JFrame {
    private String[] labels={"1","2","3","4","5","6","7","8","9","*","0","#","send"," ","end"};
    private JButton bclear;
    private JTextField jTextField;
    JPanel buttonPanel= new JPanel();

    public Chapter8_6() {
        setTitle("");
        setSize(420,300);
        setLayout(new BorderLayout());

        jTextField = new JTextField("");
        add(jTextField, BorderLayout.NORTH);

        JButton[] button = new JButton[16];
        int index=0;
        for(int i=0; i<5; i++){
            for(int cols=0; cols<3; cols++){
                button[index] =new JButton(labels[index]);
                buttonPanel.add(button[index]);
                index++;
            }
        }
        buttonPanel.setLayout(new GridLayout(0,3,3,3));
        add(buttonPanel);

        bclear = new JButton("clear");
        add(bclear,BorderLayout.EAST);

        setVisible(true);
    }

    public static void main(String args[]){
        Chapter8_6 Chapter8_6 = new Chapter8_6();
    }
}
