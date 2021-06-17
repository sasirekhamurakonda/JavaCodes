package Edyst;

import java.util.*;
import java.lang.*;
import java.io.*;
public class CodeChef {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int a,b,r;
        int[] matches={6,2,5,5,4,5,6,3,7,6};
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            a=Integer.parseInt(sarr[0]);
            b=Integer.parseInt(sarr[1]);
            int c=a+b;
            res[i]=0;
            while(c>0){
                r=c%10;
                res[i]+=matches[r];
                System.out.println(r+" "+res[i]);
                c=c/10;

            }
        }
        for(int i=0;i<t;i++)
            System.out.println(res[i]);
    }
}