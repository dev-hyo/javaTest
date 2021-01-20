package javaTest.PowerJava.Chapter3;

//1부터 100사이의 정수 중에서 3또는 4의 배수의 합을 계산하라

public class Chapter3_1 {
    public static void main(String args[]){
        int three = 0,four = 0;

        for(int i=0; i<=100; i++){
            if(i%3==0){
                three = three +i;
            }
            else if (i%4==0){
                 four = four+i;
            }
        }

        int sum = three + four;
        System.out.println("3또는 4의 배수의 합=" + sum);
            
        
    }
}
