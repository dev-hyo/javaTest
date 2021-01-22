package javaTest.BaekJoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remainder {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int[10];
        int count =0;
        int counts[] = new int[42];

        for(int i=0; i<arr.length;i++){
            arr[i] = Integer.parseInt(bufferedReader.readLine());
        }
        for(int i=0; i<arr.length;i++){
            counts[arr[i]%42]++;
        }
        for(int i=0; i<counts.length; i++){
            if(counts[i]!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
