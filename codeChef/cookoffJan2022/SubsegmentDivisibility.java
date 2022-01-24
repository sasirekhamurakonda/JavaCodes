package codeChef.cookoffJan2022;


import java.util.*;
import java.lang.*;
import java.io.*;

class SubsegmentDivisibility
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            System.out.print("1");
            for(int j=1;j<n;j++){
                System.out.print(" "+(2*j));
            }
            System.out.println();
        }
    }
}
