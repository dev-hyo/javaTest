package javaTest.PowerJava.Chapter3;

//두 개의 주사위의 합이 6이 되는 경우는 몇 가지있을까?
//합이 6이 되는 경우의 수를 출력하는 프로그램을 작성하자.

public class Chapter3_3 {
    public static void main(String args[]){
        for(int i=1; i<=6; i++){
            for(int j=1; j<=6; j++){
                if(i+j ==6){
                    System.out.print("("+i+","+j+")");
                }
            }
        }
    }
}
