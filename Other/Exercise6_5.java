package javaTest.Other;

//6-4에서 작성한 클래스메서드 getDistance()를 Mypoint클래스의 인스턴스메서드로 정의
class MyPoint {
    int x,y;

    MyPoint(int x,int y){
        this.x =x;
        this.y =y;
    }

    public double getDistance(int x, int y) {
        int xd = (int)Math.pow((this.x-x),2);
        int yd = (int)Math.pow((this.y-y),2);
        double d=Math.sqrt(xd+yd);
        return d;
    }
}
public class Exercise6_5 {
    public static void main(String[] args){
        MyPoint point = new MyPoint(1,1);
        System.out.println(point.getDistance(2,2));
    }


}
