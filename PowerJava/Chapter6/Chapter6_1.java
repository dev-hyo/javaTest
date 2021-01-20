package javaTest.PowerJava.Chapter6;


//원을 나타내는 Circle 클래스를 상속받아서 피자를 나타내는 Pizza클래스를 작성하자.

class Circle{
    protected int radius;

    public Circle(int r){
        radius=r;
    }
}

public class Chapter6_1 extends Circle{
    String pizzaName;

    public Chapter6_1(String pizzaName, int r) {
        super(r);
        this.pizzaName=pizzaName;
    }
    public void print(){
        System.out.println("피자의 종류:"+pizzaName+","+"피자의 크기:"+super.radius);
    }

    public static void main(String[] args){
        Chapter6_1 pizza = new Chapter6_1("Pepperoni",20);
        pizza.print();
    }
}
