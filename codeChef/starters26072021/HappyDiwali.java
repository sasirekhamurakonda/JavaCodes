package codeChef.starters26072021;


import java.util.*;
import java.lang.*;
import java.io.*;
class HappyDiwali {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        long p,a,b,c,x,y;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            p=Long.parseLong(sarr[0]);
            a=Long.parseLong(sarr[1]);
            b=Long.parseLong(sarr[2]);
            c=Long.parseLong(sarr[3]);
            x=Long.parseLong(sarr[4]);
            y=Long.parseLong(sarr[5]);
            long eachb=a*x+b;
            long eachc=a*x+c;
            long finalb=p/eachb;
            long finalc=p/eachc;
            System.out.println(Math.max(finalb,finalc));
        }
    }
}
/*
3
100 5 5 10 4 8
16 2 2 2 1 1
55 1 2 3 4 5
 */