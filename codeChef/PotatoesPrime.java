package codeChef;
import java.util.*;
import java.lang.*;
import java.io.*;
public class PotatoesPrime {
    public static boolean isPrime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int a,b,r;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            a=Integer.parseInt(sarr[0]);
            b=Integer.parseInt(sarr[1]);
            r=a+b;
            int count=1;
            r+=count;
            while(!isPrime(r)){
                r+=1;
                count+=1;
            }
            res[i]=count;
        }
        for(int i=0;i<t;i++)
            System.out.println(res[i]);
    }
}