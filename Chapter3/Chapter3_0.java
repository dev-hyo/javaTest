package javaTest.Chapter3;

import java.util.Scanner;

//난수, 0부터 100사이의 수 중에서 하나를 임의로 선택한다. 사용자는 이 수를 맞추어야 한다.
// 사용자가 숫자를 입력하면 컴퓨터는 자신의 숫자보다 낮은지 높은지 알려준다
public class Chapter3_0 {
    public static void main(String argsp[]){
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random()*100);
        int guess;
        int tryNumbers=0;

        do{
            System.out.print("정답을 추측하세요 :");
            guess = scanner.nextInt();
            tryNumbers++;

            if(guess < answer){
                System.out.println("Too Low");
            }else if(guess > answer){
                System.out.println("Too high");
            }
        }while (guess != answer);
        System.out.println("축하합니다." + "시도횟수=" + tryNumbers);

    }

}
