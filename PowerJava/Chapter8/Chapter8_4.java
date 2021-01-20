package javaTest.PowerJava.Chapter8;

//난수를 발생하여 레이블을 불규칙하게 배치하여 보자, 어떤 배치 관리자를 어떻게 사용하여야 하는가

import javax.swing.*;
import java.awt.*;

public class Chapter8_4 extends JFrame {
    JPanel jPanel = new JPanel();
    JLabel[] jLabels = new JLabel[30];

    Chapter8_4(){
        setSize(480,320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");
        jPanel.setLayout(null);

        for(int i=0; i<30; i++){
            jLabels[i] = new JLabel(""+i);
            int x=(int)(480*Math.random());
            int y=(int)(320*Math.random());
            jLabels[i].setForeground(Color.magenta);
            jLabels[i].setLocation(x,y);
            jLabels[i].setSize(15,15);
            jPanel.add(jLabels[i]);
        }
        add(jPanel);
        setVisible(true);
    }
    public static void main(String args[]){
        Chapter8_4 chapter8_4 = new Chapter8_4();
    }
}
