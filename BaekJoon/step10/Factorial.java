package javaTest.BaekJoon.step10;

// 10872번 팩토리얼
// 0보다 크거나 같은 정수 N이 주어지는데 N!을 출력하는 프로그램 작성

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {
    public static void main(String args[])throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        int sum = factorial(N);
        System.out.println(sum);
    }
    public static int factorial(int N){
        if(N<=1){      // N이 1또는 0이 될 때
            return 1;
        }
        return N*factorial(N-1);
    }
}
