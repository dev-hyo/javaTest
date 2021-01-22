package javaTest.BaekJoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] num = new int[10];
        int value = Integer.parseInt(bufferedReader.readLine()) * Integer.parseInt(bufferedReader.readLine()) *Integer.parseInt(bufferedReader.readLine());

        //String.valueOf() : 파라미터가 null이면 무자열 null을 만들어서 담는다.
        //int형은 String형으로 변환
        String str = String.valueOf(value); //결과값

        //0~9까지 각각의 수를 검사
        //str.length : 문자열의 길이 8
        for(int i=0;i<str.length(); i++){
            //str 문자열에서 i번째에 있는 문자를 char타입으로 변환
            //chatAt-0 또는 -48 값 추출 , index값 1증가
            num[(str.charAt(i)-48)]++;
        }
        //0부터 9까지 모든 원소 출력
        for(int j:num){
            System.out.println(j);
        }
    }
}
