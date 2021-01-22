package javaTest.BaekJoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Max {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];

        for(int i=0;i<9;i++){
            arr[i] = Integer.parseInt(bufferedReader.readLine());

            if(arr[i]>100){
                System.out.println("100보다 작아야 합니다.");
                bufferedReader.close();
            }
        }
        int max=0;
        int index=0;
        int count=0;

        for(int value:arr){
            count++;


            if(value>max){
                max=value;
                index=count;
            }
        }
        System.out.println(max);
        System.out.println(index);

    }
}
