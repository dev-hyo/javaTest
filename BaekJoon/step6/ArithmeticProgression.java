package javaTest.BaekJoon.step6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticProgression {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(arithmetic_progression(Integer.parseInt(br.readLine())));
    }

    public static int arithmetic_progression(int num) {
        int cnt = 0;           // 한수 초기화
        if (num < 100) {       //1~99가 수열이므로, 100보다 작은 경우
            return num;        //num을 리턴
        }
        else {                 //100보다 큰 경우
            cnt = 99;          //한수의 최소개수 99개
            if (num == 1000) { //예외처리. 입력값은 최대 1000일 경우
                num = 999;     //num은 999
            }

            for (int i = 100; i <= num; i++) {   //num 반복하면서 한수의 개수 카운트
                int hundreds = i / 100;          // 백의 자릿수
                int tens = (i / 10) % 10;        // 십의 자릿수
                int units = i % 10;              // 일의 자릿수

                if ((hundreds - tens) == (tens - units)) { // 각 자릿수가 수열을 이루면
                    cnt++;                                 // 한수 값 증가
                }
            }
        }
        return cnt;
    }
}

