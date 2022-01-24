package Revenge;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class NDX {

    public static void main(String[] args) throws IOException{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int D=Integer.parseInt(br.readLine());
        int X=Integer.parseInt(br.readLine());
        String mins=String.valueOf(Math.pow(10,N-1));
        String maxs=String.valueOf(Math.pow(10,N));
        System.out.println(mins+" "+maxs);
        BigInteger min=new BigInteger(mins);//if N is 2 then min =10
        BigInteger max=new BigInteger(maxs);// if N is 2 then max= 99
        System.out.println(min+" "+max);

    }
}