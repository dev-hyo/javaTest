package javaTest.BaekJoon.step5;

//1546번 평균

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double arr[] = new double[Integer.parseInt(bufferedReader.readLine())]; //과목의 개수 입력 :3
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine()); // 점수 : 40 80 60

        for(int i=0; i<arr.length; i++){ //0, 1, 2
            //arr[0] = 40
            //arr[1] = 80
            //arr[2] = 60
            arr[i] = Double.parseDouble(stringTokenizer.nextToken());
        }
        double sum=0;     //합계 초기화
        Arrays.sort(arr); //정렬, 40 60 80

        for(int i=0; i<arr.length; i++){ //0 1 2
            //arr.length-1은 가장 마지막 요소
            //sum = 0 + ( 40/80*100 ) -> 50
            //sum = 50 + (60/80*100 ) -> 125
            //sum = 125 + (80/80*100 ) -> 225
            sum = sum+((arr[i]/arr[arr.length-1]*100));
        }
        System.out.println(sum/arr.length); //(225/3) -> 75.0
    }
}
