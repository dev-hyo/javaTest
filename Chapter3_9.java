package javaTest;

import java.util.Scanner;

//반복문을 이용하여 피보나치 수열을 구하는 프로그램을 작성하여 보자
public class Chapter3_9 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 항의 개수 :");

        int numbers = scanner.nextInt();
        int num1 = 0, num2 = 1, num3=0;
        System.out.print(num1 + " " + num2);

        for(int i=3; i<=numbers; i++ ){
            num3 = num1 + num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
