package codeChef.starters12102021;

import java.util.*;
import java.lang.*;
import java.io.*;
class SubTask {
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n,m,k;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            m=Integer.parseInt(sarr[1]);
            k=Integer.parseInt(sarr[2]);
            sarr=br.readLine().split(" ");
            int count=0;
            for(int j=0;j<n;j++){
                if(sarr[j].equals("1")){
                    count++;
                }
                else{
                    break;
                }
            }
            if(count==n)
                System.out.println("100");
            else if(count==m)
                System.out.println(k);
            else
                System.out.println("0");

        }
    }
}