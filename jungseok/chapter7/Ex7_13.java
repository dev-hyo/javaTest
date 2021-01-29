package javaTest.jungseok.chapter7;

public class Ex7_13 {
    class InstanceInner{}
    static class StaticInner{}

    //인스턴스멤버 간에 서로 직접 접근이 가능
    InstanceInner iv = new InstanceInner();
    //static 멤버 간에 서로 직접 접근이 가능
    static StaticInner cv = new StaticInner();

    //static멤버의 인스턴스멤버 접근
    static void staticMethod(){
        StaticInner obj2 = new StaticInner();

        //객체를 생성
        //인스턴스클래스는 외부 클래스를 먼저 생성해야만 생성 가능
        Ex7_13 outer = new Ex7_13();
        InstanceInner obj1 = outer.new InstanceInner();
    }

    //인스턴스메서드에서 인스턴스멤버와 static멤버의 접근 모두 가능
    void instanceMethod(){
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        //메서드 내에 지역적으로 선언된 내부 클래스는 외부에서 접근할 수 없다.
        //LocalInner lv = new LocalInner();
    }

    void myMethod(){
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }
}
