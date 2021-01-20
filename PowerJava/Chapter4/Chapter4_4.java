package javaTest.PowerJava.Chapter4;

//복소수를 나타내는 클래스를 만들어 보자.
//복소수는 real + imag * i 와 같은 형태를 갖는다.

class complexNumber{
    int real;
    int imag;

    public String add(){
        return real+"+"+(imag+"i");
    }
}

public class Chapter4_4 {
    public static void main(String args[]){
        complexNumber complexNumber = new complexNumber();
        complexNumber.real=10;
        complexNumber.imag=20;
        System.out.println(complexNumber.add());
    }
}
