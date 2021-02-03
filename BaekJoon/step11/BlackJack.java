package javaTest.BaekJoon.step11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BlackJack {
    public static void main(String args[])throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");

        int N=Integer.parseInt(stringTokenizer.nextToken());
        int M=Integer.parseInt(stringTokenizer.nextToken());

        int[] arr = new int[N];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine()," ");
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        int result = search(arr,N,M);
        System.out.println(result);
    }

    static int search(int[] arr, int N, int M){
        int result=0;

        for(int i=0;i<N-2;i++){
            for(int j=i+1; j<N-1; j++){
                for(int k=j+1; k<N; k++){
                    int tmp = arr[i]+arr[j]+arr[k];

                    if(M==tmp){
                        return tmp;
                    }

                    if(result<tmp && tmp <M){
                        result = tmp;
                    }
                }

            }
        }
        return result;
    }

}
