package javaTest.BaekJoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OX {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));

        StringBuilder stringBuilder =new StringBuilder();

        int n = Integer.parseInt(bufferedReader.readLine()); //테스트케이스 :3
        String arr[] = new String[n]; // arr[3]

        for(int i=0; i<n; i++){       // 3번 반복
            // arr[0] = ooxxoxxooo
            // arr[1] = ooxxooxxoo
            // arr[2] = oooooooooo
            arr[i] = bufferedReader.readLine();
        }
        for(int i=0; i<n; i++){
            int cnt =0; //연속횟수 계산
            int sum =0; //누적합산

            for(int j=0;j<arr[i].length(); j++){ //arr[i]배열의 길이만큼 반복
                if(arr[i].charAt(j)=='O'){       //arr[i]의 인덱스 j위치에 0이 있다면
                    cnt++;                       //cnt 증가
                }else{                           //아니면
                    cnt=0;                       //cnt는 0
                }
                sum = sum + cnt;                 //합계 계산
            }
            stringBuilder.append(sum).append('\n');
        }
        System.out.print(stringBuilder);
    }
}
