package javaTest.BaekJoon.step4;

import java.io.*;
import java.util.StringTokenizer;

public class APlusB {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            if(a==0&&b==0){
                break;
            }
            int sum = a+b;
            bufferedWriter.write(sum+"\n");
        }
        bufferedWriter.flush();
        bufferedReader.close();
    }
}
