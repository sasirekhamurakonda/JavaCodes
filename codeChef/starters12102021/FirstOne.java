package codeChef.starters12102021;

import java.util.*;
import java.lang.*;
import java.io.*;
class FirstOne {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n,x,y;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            x=Integer.parseInt(sarr[1]);
            y=Integer.parseInt(sarr[2]);
            if((n+1)*y>=x){
                System.out.println("YES");
            }
            else
                System.out.println("No");
        }
    }
}