package javaTest.Chapter6;

//일반적인 사각형을 나타내는 Rectangle클래스가 다음과 같이 정의된다.
class Rectangle{
    int width,height;
    public Rectangle(int width,int height){
        this.width=width;
        this.height=height;
    }
}
//위의 클래스를 상속받아서 색깔 있는 사각형을 나타내느 ColorRectangle 클래스를 정의한다.
//ColorReactangle클래스는 색상을 나타내는 필드 String color;가 추가된다.
class ColorRectangle extends Rectangle{
    public String color;

    public ColorRectangle(int width, int height, String color) {
        super(width, height);
        this.color=color;
    }
}

public class Chapter6_5 {
    public static void main(String args[]){
        ColorRectangle colorRectangle=new ColorRectangle(100,100,"blue");
        System.out.println("가로 :"+colorRectangle.width);
        System.out.println("세로 :"+colorRectangle.height);
        System.out.println("색상 :"+colorRectangle.color);
    }
}
