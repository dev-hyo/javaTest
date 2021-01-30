package javaTest.jungseok.chapter7;

class Product_3{
    int price; //제품의 가격
    int bonusPoint; //제품구매 시 제공하는 보너스 점수

    Product_3(int price){
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

    Product_3() { }         //Product_3 클래스에 기본생성자 Product_3() 추가
}

class Tv extends Product_3{
    Tv(){ }                 //error. There is no default constructor available

    public String toString(){
        return "TV";
    }
}

public class Exercise7_3 {
    public static void main(String[] args){
        Tv t = new Tv();
    }
}
