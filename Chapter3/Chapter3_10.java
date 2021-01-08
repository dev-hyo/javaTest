package javaTest.Chapter3;

//{1.0,2.0,3.0,4.0} 과 같은 초기값을 가지는 배열을 생성한다.
//모든 배열 요소를 출력한 후에 모든 요소를 더하여 합을 출력하고
//요소 중에서 가장 큰 값을 찾아서 출력하라

import java.util.Arrays;

public class Chapter3_10 {
    public static void main(String args[]){
        double[] numbers={1.0,2.0,3.0,4.0};
        double sum=0;
        double max=numbers[0];

        for(int i=0; i<numbers.length; i++){
            sum = sum + numbers[i];

            if(max<numbers[i]){
                max = numbers[i];
            }
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("합은 "+sum);
        System.out.println("최대값은" + max);

    }
}
