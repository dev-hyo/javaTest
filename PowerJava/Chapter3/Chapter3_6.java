package javaTest.PowerJava.Chapter3;

//2와 100사이에 있는 모든 소수를 찾는 프로그램을 작성하라.
//주어진 정수k를 2부터 k-1까지의 숫자로 나누어서 나머지가 0인 것이 하나라도 있으면 소수가 아니다

public class Chapter3_6 {
    public static void main(String args[]) {
        boolean isPrime = false;

        for(int x = 2; x <= 100; x++) {
            for(int y = 2; y < x; y++) {
                if(x%y == 0) { // 소수가 아닐 경우
                    isPrime = true;
                    break;
                }
            }

            if(isPrime == false) {
                System.out.print(x + " ");
            }
            isPrime = false;
        }
    }
}
