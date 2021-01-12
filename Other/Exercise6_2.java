package javaTest.Other;

class Student{
    String name; //학생이름
    int ban;     //반
    int no;      //번호
    int kor;     //국어점수
    int eng;     //영어점수
    int math;    //수학점수
    int sum;     //합계
    double avg;  //평균

    Student(String name,int ban,int no,int kor,int eng,int math){
        this.name=name;
        this.ban=ban;
        this.no=no;
        this.kor=kor;
        this.eng=eng;
        this.math=math;
        this.sum = kor+eng+math;
        this.avg = (double)sum/3;
    }

    public String info() {
        return name+","+ban+","+no+","+kor+","+eng+","+math+","+sum+","+avg;
    }
}

public class Exercise6_2 {
    public static void main(String[] args){
        Student student = new Student("홍길동",1,1,100,60,76);
        String s = student.info();
        System.out.println(s);
    }
}
