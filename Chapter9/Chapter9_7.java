package javaTest.Chapter9;

import javaTest.Chapter8.Chapter8_6;

import javax.swing.*;
import java.awt.*;

public class Chapter9_7 extends JFrame{
    private String[] labels={"1","2","3","4","5","6","7","8","9","+","-","*","/","C","="};
    private JTextField jTextField;
    JPanel buttonPanel= new JPanel();

    public Chapter9_7() {
        setTitle("Java Calculator");
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
        buttonPanel.setLayout(new GridLayout(0,4,3,3));
        add(buttonPanel);


        setVisible(true);
    }

        public static void main(String args[]){
            Chapter9_7 chapter9_7 = new Chapter9_7();
        }

}
