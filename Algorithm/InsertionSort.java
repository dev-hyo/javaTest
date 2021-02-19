package javaTest.Algorithm;

public class InsertionSort {
    public static void main(String[] args){
        int a[] = {4,2,3,5,9,1,8,6,7};
        int b,j;

        for(int i=1;i<a.length;i++){
            b = a[i];

            for(j=i-1;j>=0&&a[j]>b;j--){
                a[j+1]=a[j];
            }
            a[j+1]=b;
        }
        for(int i=0;i<a.length;i++){
            System.out.print(" "+ a[i]);
        }
    }
}

