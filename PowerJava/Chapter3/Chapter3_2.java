package javaTest.PowerJava.Chapter3;

//사용자가 입력한 값이 1,2,...,9이면 "ONE","TWO","...","NINE"과 같이 출력하는 프로그램
//1부터 9사이가 아니면 OTHER를 출력한다.

import java.util.Scanner;

public class Chapter3_2 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int numbers = scanner.nextInt();

        if(numbers==1){
            System.out.println("ONE");
        }else if(numbers==2){
            System.out.println("TWO");
        }else if(numbers==3){
            System.out.println("THREE");
        }else if(numbers==4){
            System.out.println("FOUR");
        }else if(numbers==5){
            System.out.println("FIVE");
        }else if(numbers==6){
            System.out.println("SIX");
        }else if(numbers==7){
            System.out.println("SEVEN");
        }else if(numbers==8){
            System.out.println("EIGHT");
        }else if(numbers==9){
            System.out.println("NINE");
        }else{
            System.out.println("OTHER");
        }
    }
}
