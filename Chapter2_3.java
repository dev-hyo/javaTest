package javaTest;

//영수증에서는 10%부가세와 잔돈 등이 인쇄되어 있다.
//구입한 상품의 가격과 손님한테 받은 금액을 입력하면 부가세와 잔돈을 출력하는 프로그램을 작성해라

import java.util.Scanner;

public class Chapter2_3 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("받은 돈 : ");

        int moneyReceived = scanner.nextInt();

        System.out.print("상품 가격 : ");

        int price = scanner.nextInt();
        int surtax = price/10;
        int change = moneyReceived-price;

        System.out.println("부가세 :" + surtax);
        System.out.println("잔돈 : " + change);

    }
}
