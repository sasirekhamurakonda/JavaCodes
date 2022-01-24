package Codeforces.round748;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class Elections {
    public static void isGreater(long a,long b,long c){
        if(a>b&&a>c){
            System.out.print(0+" ");
        }
        else{
            long max=Math.max(b,c);
            System.out.print((max-a+1)+" ");
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        long a,b,c;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            a=Long.parseLong(sarr[0]);
            b=Long.parseLong(sarr[1]);
            c=Long.parseLong(sarr[2]);
            isGreater(a,b,c);
            isGreater(b,a,c);
            isGreater(c,a,b);
            System.out.println();
        }
    }
}
/*
Example
inputCopy
5
0 0 0
10 75 15
13 13 17
1000 0 0
0 1000000000 0
outputCopy
1 1 1
66 0 61
5 5 0
0 1001 1001
1000000001 0 1000000001
 */