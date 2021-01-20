package javaTest.PowerJava.Chapter7.rps;

//가위,바위,보 게임을 학습한 난수 발생기 클래스 Random을 이용하여 구현해 보자
//사용자와 컴퓨터가 대결하는 것으로 하고 컴퓨터는 0부터 2까지의 난수를 발생한다.
// 0은 가위, 1은 바위, 2는 보로 간주하고 사용자가 입력한 수를 비교하여서 승부를 결정해라.

import java.util.Random;
import java.util.Scanner;

class RockPaperScissors{
    String[] str = {"가위","바위","보"};
    int computer,user;
    boolean win;
    String winner;

    void start(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do{
            System.out.print("하나를 선택하세요 : 가위(0), 바위(1), 보(2) : ");
            user =scanner.nextInt();
        }while (user<0 || user >3);

        //0~2까지
        computer=random.nextInt(3);
    }

    private void win(){
        if((user==0&&computer==2) || (user==1&&computer==0) || (user==2&&computer==1)){
            win = true;
            winner = "유저";
        }else if((user==2&&computer==0) || (user==0&&computer==1) || (user==1&&computer==2)){
            win = true;
            winner = "컴퓨터";
        }
    }

    void print(){
        System.out.println("유저는 "+str[user] +"를 냈습니다.");
        System.out.println("컴퓨터는 "+str[computer]+"를 냈습니다.");

        win();

        if(win){
            System.out.println(winner+"가 이겼습니다.");
        }else{
            System.out.println("비겼습니다");
        }
    }
}


public class Chapter7_3 {
    public static void main(String args[]) {
        RockPaperScissors rockPaperScissors = new RockPaperScissors();
        rockPaperScissors.start();
        rockPaperScissors.print();
    }
}
