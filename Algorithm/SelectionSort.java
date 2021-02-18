package javaTest.Algorithm;

public class SelectionSort {
    public static void main(String[] args){
        int a[] = {4,2,3,5,9,1,8,6,7};
        int b;

        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){    //4 > 2
                    b = a[j];     //b = 2
                    a[j] = a[i];  //a[j] = 4
                    a[i] = b;     //a[i] = 2
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(" "+ a[i]);
        }
    }
}
