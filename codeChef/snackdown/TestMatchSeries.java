package codeChef.snackdown;


import java.util.*;
import java.lang.*;
import java.io.*;
public class TestMatchSeries {
    public static int findx(int a,int b,int c,int d,int e,int check){
        int count=0;
        if(a==check)count++;
        if(b==check)count++;
        if(c==check)count++;
        if(d==check)count++;
        if(e==check)count++;
        return count;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int a,b,r,p,q;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            a=Integer.parseInt(sarr[0]);
            b=Integer.parseInt(sarr[1]);
            r=Integer.parseInt(sarr[2]);
            p=Integer.parseInt(sarr[3]);
            q=Integer.parseInt(sarr[4]);
            int draw=findx(a,b,r,p,q,0);
            int india=findx(a,b,r,p,q,1);
            int england=findx(a,b,r,p,q,2);
            if(india>england){
                System.out.println("INDIA");
            }
            else if(india<england){
                System.out.println("ENGLAND");
            }
            else{
                System.out.println("DRAW");
            }
        }
    }
}