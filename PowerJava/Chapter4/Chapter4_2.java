package javaTest.PowerJava.Chapter4;

//강아지를 나타내는 클래스 Dog를 만들자.
//강아지 클래스는 종(breed), 나이(age), 색깔(color) 등의 필드를 가지며,
// barking(), hungry(), sleeping()메소드를 가진다.

class Dog{
    String breed; //종
    int age; //나이
    String color; //색깔

    void barking(){ System.out.println("barking()"); }
    void hungry(){ System.out.println("hungry()"); }
    void sleeping(){ System.out.println("sleeping()"); }
}

public class Chapter4_2 {
    public static void main(String args[]){
        Dog dog = new Dog();
        dog.breed = "york";
        dog.age=1;
        dog.color="orange";

        System.out.println("("+dog.breed+","+dog.age+","+dog.color+")");
        dog.barking();
        dog.hungry();
        dog.sleeping();
    }


}
