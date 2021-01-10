package javaTest.Chapter5;

//학생들의 성적을 받아서 평균을 구하는 프로그램을 작성하라

import java.util.Scanner;

class Student {
    private int score;
    void setScore(int score){
        this.score=score;
    }
    int getScore(){
        return score;
    }
}
public class Chapter5_3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int scores[] = new int[5];
        int total=0;

        for(int i=0; i<scores.length; i++){
            System.out.print("성적을 입력하세요 : ");
            scores[i] = scanner.nextInt();
        }

        for(int i=0;i<scores.length; i++){
            total = total + scores[i];
        }
        System.out.println("합계 :" + total);
        System.out.println("평균 :" + (double)total/scores.length);
    }
}
