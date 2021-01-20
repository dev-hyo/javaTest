package javaTest.PowerJava.Other;
// 6-2에서 정의한 Student클래스에
// 다음과 같이 정의된 두 개의 메서드 getTotal() 과 getAverage() 를 추가

class Student{
    String name;
    int ban,no,kor,eng,math;

    public int getTotal() {
        int sum;
        return sum =kor+eng+math;
    }

    public double getAverage() {
        double avg;
        return avg = (double)(kor+eng+math)/3;
    }
}


public class Exercise6_3 {
    public static void main(String[] args){
        Student student = new Student();
        student.name="홍길동";
        student.ban=1;
        student.no=1;
        student.kor=100;
        student.eng=60;
        student.math=76;

        System.out.println("이름 :"+student.name);
        System.out.println("총점 :"+student.getTotal());
        System.out.println("총점 :"+student.getAverage());
    }
}
