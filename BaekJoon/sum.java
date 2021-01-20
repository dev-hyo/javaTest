package javaTest.BaekJoon;

//n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());
        bufferedReader.close();

        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
