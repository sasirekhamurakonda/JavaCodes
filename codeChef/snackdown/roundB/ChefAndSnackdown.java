package codeChef.snackdown.roundB;

import java.util.*;
import java.lang.*;
import java.io.*;
public class ChefAndSnackdown{
    public static int getmin(int n,long curr_sum,long k,int count,Map<String,Integer> hm){
        System.out.println(n+" "+curr_sum+" "+count);
        if(n==0)return 1000001;
        if(k<curr_sum){
            return 1000001;
        }
        if(k==curr_sum){
            return count;
        }
        String s=curr_sum+" "+n;
        if(hm.containsKey(s)){
            return hm.get(s);
        }
         int value=Math.min(getmin(n-1,curr_sum+n,k,count+1,hm),getmin(n-1,curr_sum,k,count,hm));
        hm.put(curr_sum+" "+n,value);
        return value;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        long k=Long.parseLong(br.readLine());
        int sumn=0;
        if(n%2==0)
            sumn=(n/2)*(n+1);
        else{
            sumn=(n)*((n+1)/2);
        }
        if (sumn > k) {
            Map<String,Integer> hm=new HashMap<>();
            int min=getmin(n,0,k,0,hm);
            System.out.println("min is "+min);
            if(min>n){
                System.out.println("-1");
            }
            else{
                System.out.println(min);
            }
        }
        else if(sumn==k){
            System.out.println(n);
        }
        else{
            System.out.println("-1");
        }
    }
}