package javaTest.PowerJava.Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chapter9_5 extends JFrame implements ActionListener {
    private JLabel label1;              //원금 라벨
    private JLabel label2;              //이율 라벨
    private JTextField money;           //원금
    private JTextField rateOfInterest;  //이율
    private JTextField interest;        //이자
    private JButton button;
    private JPanel panel;

    public Chapter9_5(){
        setTitle("이자 계산기");
        setSize(520,180);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        label1 = new JLabel("원금을 입력하시오.");
        money = new JTextField(10);

        label2 = new JLabel("이율을 입력하시오.");
        rateOfInterest = new JTextField(10);

        button = new JButton("변환");
        button.addActionListener(this);

        interest = new JTextField(20);

        panel = new JPanel();

        panel.add(label1);
        panel.add(money);
        panel.add(label2);
        panel.add(rateOfInterest);
        panel.add(button,BorderLayout.SOUTH );
        panel.add(interest,BorderLayout.SOUTH );
        add(panel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            interest.setText("이자는 연" + (long)(Integer.valueOf(money.getText()) * Float.valueOf(rateOfInterest.getText())/100) + "만원 입니다.");
        }
    }

    public static void main(String[] args) {
        Chapter9_5 chapter9_5 = new Chapter9_5();
    }
}
