package javaTest.Chapter7.game;


import java.util.Random;
import java.util.Scanner;


class Die{
    int value=0;
    Random random = new Random();

    Die(){
        value=1;
    }

    int roll(){
        this.value = (random.nextInt(5)+1);
        return this.value;
    }

    void setValue(int v){
        this.value=v;
    }

    private int getValue() {
        return this.value;
    }

    public String toString(){
        return "현재 주사위 상태 :"+getValue();
    }


}

public class Chapter7_1 {
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        Die computer = new Die();
        Die player = new Die();

        int num;

        computer.setValue(computer.roll());
        System.out.print("숫자를 입력해주세요 :");
        num = scanner.nextInt();
        player.setValue(num);

        if(player.value>computer.value){
            System.out.println("사용자가 이겼습니다.");
        }else if(player.value==computer.value){
            System.out.println("비겼습니다");
        }else{
            System.out.println("사용자가 졌습니다.");
        }
        System.out.println(player.value);
        System.out.println(computer.value);
    }
}
