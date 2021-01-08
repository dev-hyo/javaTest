package javaTest.Chapter3;

//1차방식 3x+10y=100 을 만족하는 모든 해를 구하는 프로그램
//x와 y는 정수이고 0<=x<=10, 0<=y<=10 라고 가정한다.

public class Chapter3_5 {
    public static void main(String args[]){
        int x,y;
        int linearEquation=100;

        for(x=0; x<=10; x++){
            for(y=0; y<=10; y++){
                if(linearEquation==(3*x)+(10*y)){
                    System.out.println("("+x+","+y+")");
                }
            }
        }
    }
}
