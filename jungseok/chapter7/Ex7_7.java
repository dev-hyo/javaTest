package javaTest.jungseok.chapter7;

public class Ex7_7 {
    public static void main(String args[]) {
        Car car = null;
        FireEngine fe = new FireEngine(); //FireEngine객체생성
        FireEngine fe2;

        fe.water();
        car = fe;  //car = (Car)fe; 에서 형변환이 생략
        //car.water(); //error, Car타입의 참조변수는 호출할 수 없다
        fe2 = (FireEngine)car;
        fe2.water();
    }
}
    class Car {
        String color;
        int door;

        //운전하는 기능
        void drive(){
            System.out.println("drive, Brrr");
        }
        //멈추는 기능
        void stop(){
            System.out.println("stop!");
        }
    }

    class FireEngine extends Car{ //소방차
        void water(){  //물 뿌리는 기능
            System.out.println("water!");
        }
    }


