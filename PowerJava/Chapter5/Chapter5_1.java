package javaTest.PowerJava.Chapter5;

//MyMetric 이라는 클래스를 작성하고 여기에 킬로미터를 마일로 변환하는 정적 메소드인 KiloToMile()을 작성하라
//반대로 마일을 킬로미터로 변환하는 정적 메소드 mileToKilo()로 작성하라
//MyMetricTest 클래스에서 이들 정적 메소드를 호출하여 테스트하자

class MyMetric{
    private final static double kilo = 1.609;

    static void KiloToMile(double input){
        System.out.println(input+"을 마일로 바꾸면 "+input/kilo);
    }
    static void mileToKilo(double input){
        System.out.println(input+"을 km로 바꾸면 "+input*kilo);
    }
}

public class Chapter5_1 {
    public static void main(String aggs[]){
        MyMetric.KiloToMile(1);
        MyMetric.mileToKilo(1);
    }
}
