package javaTest.BaekJoon.step7;

public class AscII {
    public static void main(String[] args) throws Exception{
        //system.in은 byte값으로 문자 한개만 읽으며 아스키코드값을 저장
        int ch = System.in.read();

        System.out.println(ch);
    }
}
