package javaTest.BaekJoon.step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dial {
    public static void main(String[] args)throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String s = bufferedReader.readLine();

        int count=0;
        int k=s.length();

        for(int i=0; i<k; i++){

            switch (s.charAt(i)){
                case 'A': case 'B': case 'C':
                    count = count + 3;
                    break;
                case 'D': case 'E': case 'F':
                    count = count + 4;
                    break;
                case 'G': case 'H': case 'I':
                    count = count + 5;
                    break;
                case 'J': case 'K': case 'L':
                    count = count + 6;
                    break;
                case 'M': case 'N': case 'O':
                    count = count + 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    count = count + 8;
                    break;
                case 'T': case 'U': case 'V':
                    count = count + 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    count = count + 10;
                    break;
            }
        }
        System.out.print(count);
    }
}
