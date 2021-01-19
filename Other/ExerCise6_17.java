package javaTest.Other;

/*메서드명 : shuffle
기 능 : 주어진 배열에 담긴 값의 위치를 바꾸는 작업을 반복하여 뒤섞이게 한다. 처리한 배열을 반환한다.
반환타입 int[]
매개병ㄴ수: int[] arr - 정수값이 담긴 배열
 */
public class ExerCise6_17 {
    private static int[] shuffle(int[] arr) {

        //매개변수 값으로 인한 유효성체크
        if(arr==null || arr.length==0){
            return arr;
        }

        for(int i=0; i<arr.length; i++){
            int j = (int)(Math.random()*arr.length);

            //original[i] 와 original[j]의 값을 바꾼다.
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] original={1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));

        int[] result=shuffle(original);
        System.out.println(java.util.Arrays.toString(result));
    }




}
