package javaTest.PowerJava.Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chapter9_3 extends JFrame {
    private JTextField mile;
    private JTextField km;
    private JLabel label;
    private JButton jButton;

    class MyListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if(e.getSource()==jButton){
                km.setText(Double.parseDouble(mile.getText())*1.609 + "");
            }
        }
    }

    public Chapter9_3(){
        setSize(520,150);
        setTitle("Mile->Km");
        setLayout(new FlowLayout());

        label = new JLabel("마일을 입력하시오");
        mile = new JTextField(10);
        km = new JTextField(10);
        jButton = new JButton("변환");
        jButton.addActionListener(new MyListener());
        JPanel jPanel = new JPanel();

        jPanel.add(label);
        jPanel.add(mile);
        jPanel.add(km);
        jPanel.add(jButton);

        add(jPanel);
        setVisible(true);
    }




    public static void main(String[] args){
        Chapter9_3 chapter9_3 = new Chapter9_3();
    }
}
