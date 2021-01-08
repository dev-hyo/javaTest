package javaTest.Chapter2;

import java.util.Scanner;

//구의반지름을 입력받아 부피를 계산하여 출력하는 프로그램 작성
//구의 반지름은 실수로 입력되며, 출력도 모두 실수형으로하여야 한다.
public class Chapter2_4 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("구의 반지름 : ");

        double sphereR = scanner.nextDouble();
        double sphereVolume = (double)4/(double)3 * Math.pow(sphereR,3);

        System.out.println("구의 부피:" + sphereVolume);

    }
}
