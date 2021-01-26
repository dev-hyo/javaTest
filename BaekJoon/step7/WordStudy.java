package javaTest.BaekJoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordStudy {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader =  new BufferedReader(new InputStreamReader(System.in));

        int[] arr=new int[26];
        String s = bufferedReader.readLine();

        for(int i=0; i<s.length();i++){                //첫번째 문자부터 마지막문자까지 검사
            if('a'<=s.charAt(i)&&s.charAt(i)<='z'){    //
                arr[s.charAt(i)-97]++;                 //소문자범위 97~122, 해당 인덱스의 값 1증가가
            }else{
                arr[s.charAt(i)-65]++;                 //대문자범위 65~90
            }
        }
        int max=-1;                                    //최댓값 선언
        char ch = '?';                                 //출력할 문자

        for(int i=0; i<26; i++){                       //0~26 반복
            if(arr[i]>max){                            //배열의 원소값이 max보다 클 경우
                max=arr[i];                            //해당 원소값으로 max를 대체
                ch=(char)(i+65);                       // ch의 문자는 인덱스에대응하는 문자로 대체
            }else if(arr[i]==max){                     // 배열의 원소값이 max랑 같으면
                ch='?';                                // 최대 문자 개수가 2개이상이므로 ?
            }
        }
        System.out.print(ch);
    }
}
