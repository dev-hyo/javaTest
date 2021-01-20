package javaTest.PowerJava.Chapter3;

//학생들의 성적을 받아서 평균을 구하는 프로그램을 작성하라

import java.util.Scanner;

public class Chapter3_12 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double avg = 0;
        
        for(int i=1; i<=5; i++){
            System.out.print("성적을 입력하세요 : ");
            int score = scanner.nextInt();
            sum = sum + score;
            avg = sum/i;
        }
        System.out.println("합계 :" + sum);
        System.out.println("평균 :" + avg);
    }
}
