package javaTest.PowerJava.Chapter7;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Chapter7_4 {
    public static void main(String args[]){
        System.out.print("문자열을 입력하시오 : ");

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(str);

        int count=st.countTokens();

        String[] arrays =new String[count];
        int i=0;

        while(st.hasMoreElements()){
            String a = st.nextToken();
            arrays[i] = a;
            System.out.print(a+",");
            i++;
        }
        System.out.println();
        System.out.println("모두" + count +"개의 단어가 있습니다.");

    }
}
