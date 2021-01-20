package javaTest.PowerJava.Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chapter9_1 extends JFrame {
    private JButton jButton1;

    class MyListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            jButton1.setText("마침내 버튼이 눌러졌습니다");
        }
    }
    public Chapter9_1(){
        setSize(400,150);
        setTitle("이벤트예제");
        setLayout(new FlowLayout());
        jButton1 = new JButton("버튼을 누르시오");
        jButton1.addActionListener(new MyListener());

        add(jButton1);
        setVisible(true);
    }
    public static void main(String[] args){
        Chapter9_1 chapter9_1 =new Chapter9_1();
    }
}
