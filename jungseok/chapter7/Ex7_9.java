package javaTest.jungseok.chapter7;

import java.util.StringTokenizer;

class Product2 {
    int price; //제품의 가격
    int bonusPoint; //제품구매 시 제공하는 보너스 점수

    Product2(int price){
        this.price=price;
        bonusPoint = (int)(price/10.0); //보너스 점수는 제품 가격의 10%
    }
    Product2(){}
}

class Tv2 extends Product2{
    Tv2(){
        //조상 클래스의 생성자 Product(int price)를 호출한다
        super(100);
    }
    //Object클래스의 toString()을 오버라이딩
    public String toString(){return "TV";}
}

class Computer2 extends Product2{
    Computer2() {super(200);}
    public String toString(){return "Computer";}
}

class Audio2 extends Product2{
    Audio2(){super(200);}
    public String toString(){return "Audio";}
}

class Buyer2{
    int money=1000; //소유금액
    int bonusPoint=0;
    Product2[] cart = new Product2[10]; //구입한 제품 저장하기 위한 배열
    int i=0; //배열에 사용될 카운터

    void buy(Product2 p){
        if(money < p.price){
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money = money - p.price;
        bonusPoint = bonusPoint + p.bonusPoint;
        cart[i++] = p; //제품을 카드에 저장한다
        System.out.println(p + "을 구입하셨습니다.");
    }
    void summary(){ //구매한 물품에 대한 정보를 요약해서 보여준다
        int sum=0;  //구입한 물품의 가격합계
        String itemList=""; //구입한 물품목록

        //반복문을 이용해서 구입한 물품의 총 가격과 목록
        for(int i=0; i< cart.length; i++){
            if(cart[i]==null) break;
            sum = sum + cart[i].price;
            itemList = itemList + cart[i]+",";
        }
        System.out.println("구입한신 물품의 총 금액 :"+sum);
        System.out.println("구입하신 제품" + itemList);
    }

}

public class Ex7_9 {
    public static void main(String args[]){
        Buyer2 b =new Buyer2();

        b.buy(new Tv2());
        b.buy(new Computer2());
        b.buy(new Audio2());
        b.summary();
    }
}
