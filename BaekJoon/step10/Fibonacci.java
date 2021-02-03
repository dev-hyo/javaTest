package javaTest.BaekJoon.step10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
    public static void main(String[] args)throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        System.out.println(fibonacci(N));
    }

    static int fibonacci(int N){
        if(N==0){
            return 0;
        }else if(N==1){
            return 1;
        }else{
            return fibonacci(N-1)+fibonacci(N-2);
        }
    }
}
