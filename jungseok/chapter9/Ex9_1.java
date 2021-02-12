package javaTest.jungseok.chapter9;

public class Ex9_1 {
    public static void main(String[] args){
        Value_nine v1 = new Value_nine(10);
        Value_nine v2 = new Value_nine(10);

        if(v1.equals(v2)){
            System.out.println("v1과 v2는 같습니다.");
        }else{
            System.out.println("v1과 v2는 다릅니다.");
        }
    }
}
class Value_nine{
    int value;

    Value_nine(int value){
        this.value=value;
    }
}

