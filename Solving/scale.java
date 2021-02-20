package javaTest.Solving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class scale {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] inputs = new int[8];
        String str = "";

        st=new StringTokenizer(bufferedReader.readLine());

        for(int i=0;i<inputs.length;i++){
            inputs[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<inputs.length-1;i++){
            if(inputs[i+1]==inputs[i]+1){
                str = "ascending";
            }else if(inputs[i+1]==inputs[i]-1){
                str = "descending";
            }else{
               str = "mixed";
               break;
            }
        }
        System.out.println(str);
    }
}
