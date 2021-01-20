package javaTest.PowerJava.Chapter5;

import java.util.Scanner;

public class Chapter5_2 {
    static int seat[] = new int[10];
    static int reserved;

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------");
        for(int i=0; i<10; i++){
            System.out.print(i+1+" ");
        }
        System.out.println();
        System.out.println("--------------------");

        for(int i:seat){
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println("--------------------");

        System.out.print("몇 번째 좌석을 예약하시겠습니까?");
        reserved = scanner.nextInt();

        seat[reserved-1]=1;
        System.out.println("예약되었습니다.");

        for(int i:seat){
            System.out.print(i +" ");
        }
    }
}
