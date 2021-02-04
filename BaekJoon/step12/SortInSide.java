package javaTest.BaekJoon.step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortInSide {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        char arr[] = bufferedReader.readLine().toCharArray();

        Arrays.sort(arr);

        for(int i=arr.length-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
