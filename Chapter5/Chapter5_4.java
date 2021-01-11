package javaTest.Chapter5;


class Plane{
    private String company;     //제조사
    private String model;       //비행기모델
    private int passenger;      //최대승객수
    static int planes;   //정적변수

    Plane(){
        this("0","0",0);
    }
    Plane(String company, String model, int passenger){
        this.company = company;
        this.model = model;
        this.passenger = passenger;
        planes++;
    }

    void setCompany(String company) { this.company = company; }
    void setModel(String model) { this.model = model; }
    void setPassenger(int passenger) { this.passenger = passenger; }
    static int getPlanes() { return planes; }

    public String toString(){
        return "제조사 :"+company+" 모델:"+model+" 승객수:"+passenger;
    }
}
public class Chapter5_4 {
    public static void main(String args[]){
        Plane plane1 = new Plane("에어버스","aa",200);
        Plane plane2 = new Plane("에어에어","bb",300);
        Plane plane3 = new Plane("우오오옹","cc",150);

        System.out.println(plane1.toString());
        System.out.println(plane2.toString());
        System.out.println(plane3.toString());
        System.out.println("현재까지 만들어진 비행기 수:" + Plane.getPlanes());
    }
}
