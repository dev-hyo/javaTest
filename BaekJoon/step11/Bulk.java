package javaTest.BaekJoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bulk {
    public static void main(String[] args)throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());
        int[][] arr = new int[N][2];
        String[] str;

        for(int i=0;i<N;i++){
            str = bufferedReader.readLine().split(" "); //문자열분리
            arr[i][0] = Integer.parseInt(str[0]); //[i][0] 몸무게
            arr[i][1] = Integer.parseInt(str[1]); //[i][1] 키
        }

        for(int i=0; i<N; i++){
            int rank=1;

            for(int j=0; j<N; j++){
                if(i==j){               //같은 사람은 비교 X
                    continue;
                }
                /*
                i번째 사람과 j번째 사람을 비교하여 i가 j보다 덩치가 작을 경우 rank 증가
                 */
                else if(arr[i][0]<arr[j][0]&&arr[i][1]<arr[j][1]){
                    rank++;
                }
            }
            System.out.print(rank+" ");
        }

    }
}
