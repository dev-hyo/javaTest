package javaTest;

import java.util.Scanner;

//정수(최대2자리)를 2진수로 변환하여 출력하는 프로그램
//Integer.toBinaryString(value) 사용하지 않고, 음수는제외하며, 반복루프는 사용하지 않는다.
public class Chapter2_5 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 : ");

        int number = scanner.nextInt();
        int numbers = number;
        char[] result = new char[7];
        result[0]='0'; result[1]='0'; result[2]='0'; result[3]='0'; result[4]='0'; result[5]='0'; result[6]='0';

        //음수 입력시
        if(number<0){
            System.out.println("음수는 불가능합니다.");
            System.exit(0);
        }

        if(number>=1){
            if(number%2==1) {
                result[6] = '1';
            }
            number = number/2;
        }

        if(number>=1){
            if(number%2==1) {
                result[5] = '1';
            }
            number = number/2;
        }

        if(number>=1){
            if(number%2==1) {
                result[4] = '1';
            }
            number = number/2;
        }

        if(number>=1){
            if(number%2==1) {
                result[3] = '1';
            }
            number = number/2;
        }

        if(number>=1){
            if(number%2==1) {
                result[2] = '1';
            }
            number = number/2;
        }

        if(number>=1){
            if(number%2==1) {
                result[1] = '1';
            }
            number = number/2;
        }
        if(number>=1){
            if(number%2==1) {
                result[0] = '1';
            }
            number = number/2;
        }


        System.out.println(numbers + ":" + result[0]+result[1]+result[2]+result[3]+result[4]+result[5]+result[6]);


    }
}
