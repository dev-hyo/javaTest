package javaTest.PowerJava.Chapter9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chapter9_4 extends JFrame implements ActionListener {
    static int x = 200, y = 50;
    JPanel panel1 = new MyPanel();
    JPanel panel2 = new JPanel();
    JButton button1, button2;

    class MyPanel extends JPanel {
        public MyPanel() {
            addKeyListener(new KeyListener() {
                public void keyPressed(KeyEvent e) {
                    System.out.println("키가 눌려졌다! ");
                    int keycode = e.getKeyCode();
                    switch (keycode) {
                        case KeyEvent.VK_LEFT: x-= 20; break;
                        case KeyEvent.VK_RIGHT: x+= 20;break;
                    }

                }
                @Override
                public void keyTyped(KeyEvent arg0) { }
                @Override
                public void keyReleased(KeyEvent arg0) { }
            });
            this.requestFocus();
            setFocusable(true);
        }

        public void paint(Graphics g) {
            super.paint(g);
            g.setColor(Color.yellow);
            g.fillArc(x,y, 30, 30, 0, 360);
        }
    }

    Chapter9_4() {
        setSize(500, 400);
        setTitle("박스 움직이기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout()); // 패널설정

        panel1.setSize(500, 400);
        panel1.setBackground(Color.yellow);
        panel2.setSize(500, 100);
        panel2.setLayout(new FlowLayout());

        button1 = new JButton("왼쪽으로 이동");
        button2 = new JButton("오른쪽으로 이동");
        panel2.add(button1);
        panel2.add(button2);
        button1.addActionListener(this);
        button2.addActionListener(this);

        add(panel1, BorderLayout.CENTER);
        add(panel2, BorderLayout.SOUTH);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent g) {
        if (g.getSource() == button1) {
            System.out.println("왼쪽으로 이동 입력됨");
            x -= 20;
            repaint();
        }
        if (g.getSource() == button2) {
            System.out.println("오른쪽으로 이동 입력됨");
            x += 20;
            repaint();
        }
    }
    public static void main(String[] args) {
        new Chapter9_4();
    }

}