package javaTest.BaekJoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();

        int sum=0;

        //getBytes()는 문자열을 입력을 받을 때 해당 문자열을 쉽게 각 자릿값을 반환받을 수 있다
        for(byte value:bufferedReader.readLine().getBytes()){
            sum = sum + (value-'0');
        }
        System.out.println(sum);
    }
}
