package javaTest.jungseok.chapter7;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.beans.EventHandler;
import java.util.logging.Handler;

public class Exercise7_9 {
    public static void main(String[] args){
        Frame frame = new Frame();
        frame.addWindowFocusListener(new WindowAdapter(){
            public void windowsClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });
    }//main
}

/*
class EventHandler extends WindowAdapter{
    public void windowsClosing(WindowEvent e){
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}
*/
