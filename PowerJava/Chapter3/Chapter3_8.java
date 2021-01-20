package javaTest.PowerJava.Chapter3;

//간단한 계산기 프로그램 작성.
//사용자로부터 하나의 문자를 입력받는다. 이어서 사용자로부터 2개의 숫자를 입력 받는다.
//덧셈, 뺄셈, 곱셈, 나눗셈을 수행하도록 작성해라.
//if-else문을 사용하고, 나눗셈의 경우 분모가 아닌 0이 아닌지를 먼저 검사하여야 한다.

import java.util.Scanner;

public class Chapter3_8 {
    public static void main(String argsp[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("연산을 입력하세요 : ");
        String operation = scanner.next();

        System.out.print("숫자 2개를 입력하세요 :");
        double numberOne = scanner.nextDouble();
        double numberTwo = scanner.nextDouble();

        if(operation.equals("+")){
            System.out.println(numberOne + "+" + numberTwo + "=" + (numberOne+numberTwo));
        }else if(operation.equals("-")){
            System.out.println(numberOne + "-" + numberTwo + "=" + (numberOne-numberTwo));
        }else if(operation.equals("*")){
            System.out.println(numberOne + "*" + numberTwo + "=" + (numberOne*numberTwo));
        }else if(operation.equals("/")){
            if(numberOne==0 || numberTwo==0){
                System.out.println("분모가 0입니다.");
            }else{
                System.out.println(numberOne + "/" + numberTwo + "=" + (numberOne/numberTwo));
            }
        }else{
            System.out.println("잘못 입력하셨습니다. +, -, *, / 중 하나를 입력하세요 ");
        }
    }
}
