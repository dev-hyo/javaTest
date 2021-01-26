package javaTest.BaekJoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordCount {
    public static void main(String[] args)throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        System.out.print(stringTokenizer.countTokens());
    }
}
