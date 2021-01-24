package javaTest.BaekJoon.step6;

public class SelfNumber {

    //생성자로 나오는 수가 출력되는 함수
    public static int d(int number){
        int sum = number;

        //셀프넘버를 찾는 반복문
        //각 자리수 더하기  위해서 나머지 연산자와 나눗셈 연산자로 10단위씩 number을 줄임
        while(number !=0 ){
            sum = sum + (number % 10); //첫째자리수   ex) sum=1+(1%10) = 2
            number = number/10;        //10을 나누어 첫째 자리 삭제 ex) num = 1/10 -> 0
        }
        return sum;                    // 2
    }

    //메인
    public static void main(String[] args){

        //배열 생성
        boolean[] check = new boolean[10001];

        //1~10000까지 반복할때 d함수에 숫자를 넣고, d함수에서 return되는 수를 저장
        for(int i=1; i<=10000; i++){
            int n =d(i);

            if(n<=10000){         //10000이 넘는 수는 필요가 없음
                check[n] = true;  //배열에 저장된 return값은 true
            }
        }
        //배열의 길이만큼 반복
        for(int i=1; i<check.length; i++){
            if(!check[i]){             //false인덱스만 출력
                System.out.println(i); //출력
            }
        }
    }
}
