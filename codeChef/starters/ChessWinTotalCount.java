package codeChef.starters;


import java.util.*;
        import java.lang.*;
        import java.io.*;
public class ChessWinTotalCount{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int a,b,r;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            a=Integer.parseInt(sarr[0]);
            b=Integer.parseInt(sarr[1]);
            r=Integer.parseInt(sarr[2]);
            //2(180+N)-A-B
            System.out.println((2*(180+a)-b-r));
        }
    }
}
/*
3
10 0 2
11 2 1
12 192 192
 */