package javaTest.BaekJoon.step8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Beehive {
    public static void main(String args[]) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        int count=1; //최소개수
        int range=2; //최솟값

        if(n==1){
          System.out.println(1);
        }else{
            while(range<=n){ //범위가 n보다 크거나 같을 때까지 반복
                range = range+(6*count); //다음 범위 최솟값으로 초기화
                count++;
            }
            System.out.println(count);
        }
    }
}
