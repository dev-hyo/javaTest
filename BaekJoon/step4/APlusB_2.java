package javaTest.BaekJoon.step4;

import java.io.*;
import java.util.StringTokenizer;

public class APlusB_2 {
    public static void main(String args[]) throws IOException {
        //IntelliJ EOF => Crtl+D
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer;
        StringBuilder stringBuilder = new StringBuilder();
        String str;

        while((str= bufferedReader.readLine())!=null){
            stringTokenizer = new StringTokenizer(str," ");
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            stringBuilder.append(a+b).append("\n");
        }
        System.out.println(stringBuilder);

        bufferedReader.close();
    }
}
