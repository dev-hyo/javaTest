package javaTest.BaekJoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindAlphabet {
    public static void main(String args[]) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[26];                //알파벳 배열 새성

        for(int i=0; i<arr.length; i++){        //모두 -1로 초기화
            arr[i]=-1;
        }
        String str = bufferedReader.readLine(); // 문자를 읽음

        for(int i=0; i<str.length(); i++){      //문자열의 길이만큼 반복
            char ch = str.charAt(i);            //charAt() 메소드로 문자열의 각 문자를 추출한 뒤 ch변수에 저장
                                                //arr배열 인덱스는 ch가 가진 문자 인코딩값 'a' 또는 97을 뺀다.
            if(arr[ch-'a']==-1){                //arr원소 값이 -1인 경우에만
                arr[ch-'a']=i;                  //ch의 문자의 위치를 arr배열  값으로 바꾼다.
            }
        }
        for(int value:arr){
            System.out.print(value+" ");
        }
    }
}

