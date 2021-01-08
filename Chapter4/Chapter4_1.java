package javaTest.Chapter4;

//학생을 나타내는 클래스 Student를 만든다.
//학생은 이름(name)과 학번(rollno), 나이를 가진다.
//Student클래스를 작성하고 객체를 생성하여 테스트하라.

class Student{
    String name; //이름
    int rollno; //학번
    int age; //나이
}

public class Chapter4_1 {
    public static void main(String args[]){
        Student student = new Student();
        student.name="KIM";
        student.rollno=20180001;
        student.age=20;

        System.out.println("학생의 이름: " + student.name);
        System.out.println("학생의 학번: " + student.rollno);
        System.out.println("학생의 나이: " + student.age);
    }
}
