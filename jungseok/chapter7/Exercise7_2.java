package javaTest.jungseok.chapter7;

//1. 섯다카드20장을 포함하는 섯다카드 한 벌(SutdaDeck클래스)을 정의한 것이다. 섯다카드 20장을 담는 SutdaCard배열을 초기화하시오,
//단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한쌍씩 있고, 숫자가 1,3,8인 경우에 둘 중의 한 장은 광(Kwang)이어야 한다.
//즉, SutdaCard의 인스턴스 변수 isKwang의 값이 true여야 한다.


class SutdaDeck{
    final int CARD_NUM=20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck(){
        for(int i=0; i< cards.length; i++){
            int num = i%10+1;
            boolean isKwang = (i<10) && (num==1 | num==3 | num==8);

            cards[i]=new SutdaCard(num,isKwang);
        }
    }

    //배열의 카드 위치를 뒤섞는다.
    void shuffle(){
        for(int i=0; i< cards.length; i++){
            int j = (int)(Math.random()* cards.length);

            SutdaCard tmp = cards[i];
            cards[i] = cards[j];
            cards[j] = tmp;
        }
    }
    //배열 cards에서 지정된 위치의 SutdaCard를 반환한다
    SutdaCard pick(int index){
        if(index<0 || index>=CARD_NUM){//index유효성검사
            return null;
        }
        return cards[index];
    }
    //임의의 위치의 SutdaCard를 반환한다
    SutdaCard pick(){
        int index = (int)(Math.random()* cards.length);
        return pick(index);  //pick(int index)호출
    }
}

class SutdaCard{
    int num;
    boolean isKwang;

    SutdaCard(){ this(1,true); }

    SutdaCard(int num, boolean isKwang){
        this.num=num;
        this.isKwang = isKwang;
    }

    public String toString(){
        return num + (isKwang?"K":"");
    }
}

public class Exercise7_2 {
    public static void main(String args[]){
        SutdaDeck deck = new SutdaDeck();

        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();

        for(int i=0; i<deck.cards.length; i++){
            System.out.print(deck.cards[i]+",");
        }
        System.out.println();
        System.out.println(deck.pick(0));
    }
}
