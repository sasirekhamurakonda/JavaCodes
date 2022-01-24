package codeChef.starters;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class IsCyclicQuad{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int a,b,r,s;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            a=Integer.parseInt(sarr[0]);
            b=Integer.parseInt(sarr[1]);
            r=Integer.parseInt(sarr[2]);
            s=Integer.parseInt(sarr[3]);
            boolean found=false;

            if(a+r==180&&b+s==180){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
        }
    }
}