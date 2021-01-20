package javaTest.PowerJava.Chapter8;

//패널을 여러개 사용하여 원하는 화면이 나오도록 하라.
//즉 패널1에 레이블을 추가하고 패널2에 버튼들을 추가한 후 패널3에 패널1과 패널2를 추가한다.
//마지막으로 패널3을 프레임에 추가한다.

import javax.swing.*;

public class Chapter8_3 extends JFrame {
    Chapter8_3(){
        setSize(480,320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("MyFrame");

        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();

        JLabel jLabel = new JLabel("자바 호텔에 오신 것을 환영합니다. 숙박일수를 입력하세요.");
        jPanel1.add(jLabel);

        JButton jButtonOne = new JButton("1일");
        JButton jButtonTwo = new JButton("2일");
        JButton jButtonThree = new JButton("3일");
        JButton jButtonFour = new JButton("4일");
        JButton jButtonFive = new JButton("5일");

        jPanel2.add(jButtonOne);
        jPanel2.add(jButtonTwo);
        jPanel2.add(jButtonThree);
        jPanel2.add(jButtonFour);
        jPanel2.add(jButtonFive);

        jPanel3.add(jPanel1);
        jPanel3.add(jPanel2);
        add(jPanel3);
        setVisible(true);
    }
    public static void main(String[] args){
        Chapter8_3 chapter8_3 = new Chapter8_3();
    }
}
