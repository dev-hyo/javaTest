package javaTest.BaekJoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinMax {
    public static void main (String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer stringTokenizer =new StringTokenizer(bufferedReader.readLine()," ");

        int index=0;
        int[] arr = new int[n];

        while(stringTokenizer.hasMoreTokens()){
            arr[index] = Integer.parseInt(stringTokenizer.nextToken());
            index++;
        }
        Arrays.sort(arr);
        System.out.println(arr[0]+" "+ arr[n - 1]);
    }
}
