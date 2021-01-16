package javaTest.Chapter8;

import javax.swing.*;
import java.awt.*;

public class Chapter8_6 extends JFrame {
    JPanel jPanel1 = new JPanel();
    JPanel jPanel2 = new JPanel();
    private String[] labels={"1","2","3","4","5","6","7","8","9","*","0","#","send"," ","end"};

    Chapter8_6() {
        setSize(520, 380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");
        jPanel1.setLayout(new GridLayout(3,5));

        JTextField jTextField = new JTextField(44);
        jTextField.setLocation(0,20);
        jPanel2.add(jTextField);

        JButton[] button = new JButton[16];
        int index=0;
        for(int i=0; i<5; i++){
            for(int cols=0; cols<3; cols++){
                button[index] =new JButton(labels[index]);
                jPanel1.add(button[index]);
                index++;
            }
        }



        add(jPanel2);
        add(jPanel1);
        setVisible(true);
    }


    public static void main(String args[]){
        Chapter8_6 Chapter8_6 = new Chapter8_6();
    }
}
