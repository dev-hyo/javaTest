package javaTest.PowerJava.Chapter6;

interface Animal{
    void walk();
    void fly();
    void sing();
}
class Bird implements Animal{
    public void walk(){
        System.out.println("걸을 수 있음");
    }

    @Override
    public void fly() {
        System.out.println("날을 수 있음");
    }

    @Override
    public void sing() {
        System.out.println("노래 부를 수 있음");
    }
}

public class Chapter6_3 {
    public static void main(String args[]){
        Animal animal = new Bird();
        animal.walk();
        animal.fly();
        animal.sing();
    }
}
