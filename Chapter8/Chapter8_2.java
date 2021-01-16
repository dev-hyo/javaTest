package javaTest.Chapter8;

//카운터의 외관만 작성,

import javax.swing.*;

public class Chapter8_2 extends JFrame {
    public Chapter8_2(){
        setSize(480,320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        //패널을 생성
        JPanel jPanel = new JPanel();
        add(jPanel);

        JLabel jLabel = new JLabel("카운터값 ");
        jPanel.add(jLabel);

        JTextField jTextField = new JTextField(10);
        jPanel.add(jTextField);

        JButton jButton = new JButton("증가");
        jPanel.add(jButton);

        add(jPanel);
        setVisible(true);
        //setLayout(new FlowLayout()); //배치관리자 설정
    }
    public static void main(String[] args){
        Chapter8_2 chapter8_2 = new Chapter8_2();
    }
}
