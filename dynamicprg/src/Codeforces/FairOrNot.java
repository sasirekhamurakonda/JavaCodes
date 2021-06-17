package Codeforces;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class FairOrNot{
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
            int min1=Math.min(a,b);
            int max1=Math.max(a,b);
            int min2=Math.min(r,s);
            int max2=Math.max(r,s);
            System.out.println(min1+" "+max1+" "+min2+" "+max2);
            if(max1>min2&&max2>min1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
/*
4
3 7 9 5
4 5 6 9
5 3 8 1
6 5 3 2

 */