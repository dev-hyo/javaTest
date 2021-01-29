package javaTest.jungseok.chapter7;

public class Ex7_12 {
    class InstanceInner{
        int iv=100;
        //static int cv = 100; //error, static변수 사용 못함
        final static int CONST = 100; //상수이므로 허용
    }
    static class StaticInner{
        int iv=200;
        static int cv = 200; //static클래스만 static멤버를 정의할 수 있다
    }
    void myMethod(){
        class LocalInner{
            int iv=300;
            final static int CONST =300;
        }
    }

    public static void main(String args[]){
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
    }
}
