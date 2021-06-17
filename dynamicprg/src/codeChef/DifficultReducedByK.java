package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;


class DifficultReducedByK
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        long[] arr;
        int n;
        long k;
        long[] res=new long[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=sarr.length;
            arr=new long[n];
            for(int j=0;j<n;j++){
                arr[j]=Long.parseLong(sarr[j]);
            }
            k=Long.parseLong(br.readLine());
            int j=0;
            for(j=n-1;j>=0;j--){
                if(k>=arr[j]){
                    k=k-arr[j];
                }
                else{
                    res[i]=j+1;
                    break;
                }
            }
            if(j<0&&k>=0)
                res[i]=0;
        }
        for(int i=0;i<t;i++)
            System.out.println(res[i]);

    }
}