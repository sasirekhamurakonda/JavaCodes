package codeChef.longjun;

import java.util.*;
import java.lang.*;
import java.io.*;
public class TotalCoconutJuiceAndPulp{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int a,b,A,B;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            a=Integer.parseInt(sarr[0]);
            b=Integer.parseInt(sarr[1]);
            A=Integer.parseInt(sarr[2]);
            B=Integer.parseInt(sarr[3]);
            System.out.println((A/a+B/b));
        }


    }
}
/*
3
100 400 1000 1200
100 450 1000 1350
150 400 1200 1200
Sample Output
13
13
11
 */