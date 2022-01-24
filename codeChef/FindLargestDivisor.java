package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;
public class FindLargestDivisor{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine());
        for(int i=10;i>0;i--){
            if(k%i==0){
                System.out.println(i);
                break;
            }
        }

    }
}