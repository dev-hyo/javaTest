package javaTest.BaekJoon.step5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 4344번 평균은 넘겠지
public class averageOver {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int c = Integer.parseInt(bufferedReader.readLine()); // 테스트케이스 :1
        int arr[];
        StringTokenizer stringTokenizer;

        for(int i=0; i<c; i++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine()," "); //학생 수 및 성적입력

            int student = Integer.parseInt(stringTokenizer.nextToken()); //학생수 2
            arr = new int[student]; // arr[2]

            double sum=0; //성적 누적 합 변수

            //성적 입력부분
            for(int j=0; j<student; j++){ //0,1
                int score = Integer.parseInt(stringTokenizer.nextToken()); //성적저장
                arr[j] = score; //arr[0] = 60, arr[1] =80
                sum=sum+score;  //sum = 140
            }
            double mean = (sum/student); //평균 : 70
            double count = 0; //평균넘는 학생 수 변수

            //평균 넘는 학생 비율 찾기
            for(int j=0; j<student;j++){
                if(arr[j]>mean){  //70을 넘는다면
                    count++;      //count 증가
                }
            }
            System.out.printf("%.3f%%\n",(count/student)*100);
        }
    }
}
