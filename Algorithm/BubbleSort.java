package javaTest.Algorithm;

public class BubbleSort {
    public static void main(String[] args){
        int a[] = {4,2,3,5,9,1,8,6,7};
        int b;

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length-i-1;j++){
                if(a[j]>a[j+1]){    //앞 데이터가 뒤 데이터보다 크면
                    b= a[j];        //b에 앞 데이터를 저장
                    a[j] = a[j+1];  //뒤 데이터와 앞 데이터를 swap
                    a[j+1] = b;     //앞 데이터를 뒤 데이터로 swap
                }
            }
        }
        for(int i=0; i<a.length; i++){
            System.out.print(" "+a[i]);
        }
    }
}
