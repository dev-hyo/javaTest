package javaTest.Other;

//두 점의 거리를 계산하는 getDistance()를 완성해라
//제곱근 계산은 Math.sqrt(double a)를 사용해라

public class Exercise6_4 {
    //두 점 (x,y)와 (x1,y1)간의 거리를 구한다.
    static double getDistance(int x,int y,int x1,int y1){

        int xd = (int)Math.pow((x1-y),2);
        int yd = (int)Math.pow((y1-y),2);
        double d=Math.sqrt(xd+yd);

        return d;
    }

    public static void main(String[] args){
        System.out.println(getDistance(1,1,2,2));
    }
}
