package javaTest.Chapter3;

//사용자로부터 키를 입력받아 표준 체중을 계산한 후에
//사용자의 체중과 비교하여 저체중인지, 표준인지, 과체중인지 판단하는 프로그램을 작성하라
//표준 체중 = (키-100)*0.9

import java.util.Scanner;

public class Chapter3_4 {
    public  static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("키를 입력하세요: ");
        int height=scanner.nextInt();

        System.out.print("몸무게를 입력하세요: ");
        int weight=scanner.nextInt();

        int standardWeight = (int)((height-100)*0.9);
        if(standardWeight>weight){
            System.out.println("저체중입니다.");
        }else if(standardWeight<weight){
            System.out.println("과체충입니다.");
        }else{
            System.out.println("표준입니다");
        }
    }

}
