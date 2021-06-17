package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;
public class XORplus123 {
    public static long findPowerOf2(int n){
        int mod=1000000007;
        long ans=1;
        long a=2;
        while(n>0){
            if((n&1)==1)ans=(ans%mod*a%mod)%mod;
            a=(a%mod*a%mod)%mod;
            n=n/2;
            //System.out.println("ans="+ans+" a="+a+" n="+n);
        }
        return ans;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n=Integer.parseInt(br.readLine());
            long power=findPowerOf2(n);
            //System.out.println("Power is "+power);
            System.out.println(power/2);
        }
    }
}