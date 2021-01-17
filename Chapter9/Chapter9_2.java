package javaTest.Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chapter9_2 extends JFrame{
    private JButton btnYellow,btnPink;

    class MyListener1 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            getContentPane().setBackground(Color.YELLOW);
        }
    }
    class MyListener2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            getContentPane().setBackground(Color.PINK);

        }
    }
    public Chapter9_2(){
        setSize(400,150);
        setTitle("이벤트예제");
        setLayout(new FlowLayout());
        btnYellow = new JButton("노란색");
        btnPink = new JButton("핑크색");
        btnYellow.addActionListener(new Chapter9_2.MyListener1());
        btnPink.addActionListener(new Chapter9_2.MyListener2());

        add(btnYellow);
        add(btnPink);
        setVisible(true);
    }
    public static void main(String[] args){
        Chapter9_2 chapter9_2 =new Chapter9_2();
    }

}
