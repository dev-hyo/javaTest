package javaTest.BaekJoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SangSu {
    public static void main(String[] args)throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        int a = Integer.parseInt(new StringBuilder(stringTokenizer.nextToken()).reverse().toString());
        int b = Integer.parseInt(new StringBuilder(stringTokenizer.nextToken()).reverse().toString());

        if(a>b){
            System.out.print(a);
        }else{
            System.out.print(b);
        }
    }
}
