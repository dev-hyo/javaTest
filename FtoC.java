package javaTest;

import java.util.Scanner;

public class FtoC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("화씨온도를 입력하시오: ");
        double c_temp = sc.nextDouble();
        c_temp = (c_temp - 32.0D) * 5.0D / 9.0D;
        System.out.println("섭씨온도는 " + c_temp);
    }
}
