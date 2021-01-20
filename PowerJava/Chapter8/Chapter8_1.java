package javaTest.PowerJava.Chapter8;

import javax.swing.*;

//외관만 작성

public class Chapter8_1 extends JFrame {
    public Chapter8_1(){
        setSize(480,320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        //패널을 생성
        JPanel jPanel = new JPanel();
        add(jPanel);

        JLabel jLabel = new JLabel("자바는 재미있나요?");
        jPanel.add(jLabel);

        JButton jButton1 = new JButton("Yes");
        JButton jButton2 = new JButton("No");

        jPanel.add(jButton1);
        jPanel.add(jButton2);

        add(jPanel);
        setVisible(true);
        //setLayout(new FlowLayout()); //배치관리자 설정
    }
    public static void main(String[] args){
        Chapter8_1 chapter8_1 = new Chapter8_1();
    }
}
