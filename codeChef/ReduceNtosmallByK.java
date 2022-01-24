package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;


class ReduceNtosmallByK
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n,k;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            k=Integer.parseInt(sarr[1]);
            if(n<k)
                System.out.println(n);
            else
                System.out.println(n%k);

        }

    }
}