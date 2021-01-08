package javaTest.Chapter4;

//날짜를 나타내는 클래스 Date를 만들자.
// Date 클래스는 연도,월,일 등의 속성을 가지고,
// 날짜를 "2012.7.12"과 같이 출력하는 메소드 print1(),
// 날짜를 "July 12,2012"와 같이 출력하는 print2() 등의 메소드를 가진다.
// Date 클래스를 작성하고 객체를 생성하여 테스트하라

class Date{
    int year;
    int month;
    int day;

    void print1() {
        year = 2012;
        month = 7;
        day = 12;
        System.out.println(year+"."+month+"."+day);
    }
    public void print2(String m,int d, int y){
        System.out.println(m +" "+ d+","+y);
    }
}

public class Chapter4_3 {
    public static void main(String args[]){
        Date dateNumber = new Date();
        dateNumber.print1();

        Date dateString = new Date();
        dateString.print2("July",12,2012);
    }
}
