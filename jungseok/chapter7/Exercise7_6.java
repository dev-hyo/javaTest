package javaTest.jungseok.chapter7;

class Outer{
    class Inner{
        int iv=100;
    }
}

public class Exercise7_6 {
    public static void main(String[] args){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        System.out.println("Inner의 멤버변수 iv의 값 :" + inner.iv);
    }
}
