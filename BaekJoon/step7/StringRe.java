package javaTest.BaekJoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringRe {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine()); //테스트케이스 수 :1

        for(int i=0; i<n; i++){
            String[] str = bufferedReader.readLine().split(" "); //공백분리하여 배열에 삽입 ex) 3 ABC

            int R = Integer.parseInt(str[0]); // 첫번째 배열값 3
            String s = str[1];                // 두번째 배열값 ABC

            for(int j=0;j<s.length();j++){    //문자열 길이만큼 반복
                for(int k=0; k<R; k++){       //R만큼 반복
                    System.out.print(s.charAt(j)); //각각의 문자를 출력
                }
            }
            System.out.println();
        }
    }
}
