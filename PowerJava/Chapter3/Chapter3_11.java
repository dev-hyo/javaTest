package javaTest.PowerJava.Chapter3;

import java.util.ArrayList;

//"Hello","JAVA","World" 를 가지고 있는 문자열의 배열을 생성해보자.
public class Chapter3_11 {
    public static void main(String args[]){
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Java");
        words.add("World");

        for(String list:words){
            System.out.println(list);
        }
    }
}
