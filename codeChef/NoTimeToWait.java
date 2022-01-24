package codeChef;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class NoTimeToWait {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] sarr=br.readLine().split(" ");
        int n=Integer.parseInt(sarr[0]);
        int h=Integer.parseInt(sarr[1]);
        int x=Integer.parseInt(sarr[2]);
        sarr=br.readLine().split(" ");
        int diff=h-x;
        int i=0;
        for(i=0;i<n;i++){
            if(Integer.parseInt(sarr[i])>=diff)
                break;
        }
        if(i==n)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}