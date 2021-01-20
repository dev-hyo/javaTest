package javaTest.PowerJava.Other;
/*
메서드명 : isNumber
기   능 : 주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다. 모두 숫자로만 이루어져 있으면 true로 반환하고, 아니면 false를 반환한다.
        만일 주어진 문자열이 null이거나 빈문자열""이라면 false를 반환한다.
반환타입 : boolean
매개변수 : Sring str - 검사할 문자열
*/

public class Exercise6_18 {

    public static boolean isNumber(String str){
        if(str==null || str.equals("")){
            return false;
        }

        //한 문자씩 차례대로 읽어온다
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            //읽어온 ch가 숫자가 아니면 false로 반환한다.
            if(ch<'0' || ch>'9'){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args){
        String str = "123";
        System.out.println(str +"는 숫자입니다?"+isNumber(str));

        str = "1234o";
        System.out.println(str +"는 숫자입니다?"+isNumber(str));
    }
}
