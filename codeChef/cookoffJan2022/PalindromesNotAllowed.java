package codeChef.cookoffJan2022;

import java.util.*;
import java.lang.*;
import java.io.*;
class PalindromesNotAllowed
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            String alphabet="abcdefghijklmnopqrstuvwxyz";
            StringBuilder res= new StringBuilder();
            int count=0;
            while(n>=26){
                res.append(alphabet);
                n=n-26;
            }
            count+=(n%26);
            res.append(alphabet.substring(0,count));
            System.out.println(res.toString());

        }

    }
}