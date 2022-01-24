package codeChef.snackdown.roundA;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class MinMaxLCM  {
    public static long hcf(long a,long b){
        if(a==0)return b;
        return hcf(b%a,a);
    }
    public static long lcm(long a,long b){
        long hc=hcf(a,b);
        return (a*b)/hc;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        long a,b;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            a=Long.parseLong(sarr[0]);
            b=Long.parseLong(sarr[1]);
            long j=0,k=0;
            long min=Long.MAX_VALUE;
            long max=Long.MIN_VALUE;
            for(j=a;j<=(a*b);j++){
                for(k=j+1;k<=(a*b);k++){
                    long L=lcm(j,k);
                    if(L<min){
                        min=L;
                    }
                    if(L>max){
                        max=L;
                    }
                }
            }
            System.out.println(min+" "+max);
        }
    }
}
/*
Sample Input 1
2
4 3
2 3
Sample Output 1
8 132
4 30
 */