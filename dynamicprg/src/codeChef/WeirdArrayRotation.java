package codeChef;

import java.util.*;
        import java.lang.*;
        import java.io.*;
class WeirdArrayRotation{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        String[] sarr=br.readLine().split(" ");
        long sum=0;
        long x=1000000007;
        for(int i=0;i<n;i++) {
            long a= Long.parseLong(sarr[i]);
            sum=(sum%x+a%x)%x;
        }
        int q=Integer.parseInt(br.readLine());
        sarr=br.readLine().split(" ");
        for(int i=0;i<q;i++){
            sum=((sum%x)+(sum%x))%x;
            System.out.println(sum);
        }
    }
}
