package javaTest.BaekJoon.step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlusCycle {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int cnt = 0;      //반복문횟수
        int n_copy = n;   //변수복사

        do {
            //십의자리와 일의자리 더하기
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            cnt++;
        } while (n_copy != n);

        System.out.println(cnt);
    }
}