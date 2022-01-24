package codeChef.starters26072021;


import java.util.*;
import java.lang.*;
import java.io.*;
public class TimeToVaccinate{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n,p,x,y;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            p=Integer.parseInt(sarr[1]);
            x=Integer.parseInt(sarr[2]);
            y=Integer.parseInt(sarr[3]);
            sarr=br.readLine().split(" ");
            int timeTaken=0;
            for(int j=0;j<p;j++){
                String c=sarr[j];
                if(c.compareTo("0")==0){
                    timeTaken+=x;
                }
                else{
                    timeTaken+=y;
                }
            }
            System.out.println(timeTaken);
        }
    }
}
/*
3
4 2 3 2
0 1 0 1
3 1 2 3
1 0 1
3 3 2 2
1 1 1
 */