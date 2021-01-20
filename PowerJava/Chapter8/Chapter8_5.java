package javaTest.PowerJava.Chapter8;

//프레임 안에 20개의 버튼을 다음과 같이 배치하는 프로그램을 작성하라,
//GridLayout을 사용하고, 버튼의 배경색은 랜덤한 색상으로 한다.

import javax.swing.*;
import java.awt.*;

public class Chapter8_5 extends JFrame {
    JPanel jPanel = new JPanel();
    JButton[] jButtons = new JButton[20];

    Chapter8_5(){
        setSize(480,320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");
        jPanel.setLayout(new GridLayout(4,5));

        for(int i=0; i<20; i++){
            int R = (int)(Math.random()*256);
            int G = (int)(Math.random()*256);
            int B = (int)(Math.random()*256);
            Color color = new Color(R,G,B);

            jButtons[i] = new JButton(""+i);
            jButtons[i].setBackground(color);

            jPanel.add(jButtons[i]);
        }
        add(jPanel);
        setVisible(true);
    }
    public static void main(String args[]){
        Chapter8_5 chapter8_5 = new Chapter8_5();
    }
}
