package javaTest.Chapter3;

//피타고라스의 정리를 이용하여, 각 변의 길이가 100보다 작은 삼각형 중에서
//피타고라스의 정리가 성립하는 직각 삼각형은 몇 개나 있을까?
//3중 반복문을 이용하여 피타고라스의 정리르 만족하는 3개의 정수를 찾아라

public class Chapter3_7 {
    public static void main(String args[]){
        for(int a=1; a<100; a++){
            for(int b=1; b<100; b++){
                for(int c=1; c<100; c++){
                    if((a*a + b*b ==c*c)){
                        System.out.println("a="+a +" b="+ b +" c="+ c);
                    }
                }
            }
        }
    }
}
