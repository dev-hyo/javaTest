package javaTest.Chapter6;


//클래스를 상속받아서 축구를 나타내는 클래스 soccer를 작성하고
//getName()과 getPlayers()를 재정의하여서 다음과 같은 출력이 나오도록 하라.

class Sports{
    String getName(){
        return "아직 결정되지 않음";
    }
    int getPlayers(){
        return 0;
    }
}

class Soccer extends Sports{
    @Override
    String getName() {
        return "축구";
    }

    @Override
    int getPlayers() {
        return 11;
    }
}

public class Chapter6_4 {
    public static void main(String args[]){
        Sports sports=new Soccer();
        System.out.println("경기 이름 : "+sports.getName());
        System.out.println("경기자 수 : "+sports.getPlayers());
    }
}
