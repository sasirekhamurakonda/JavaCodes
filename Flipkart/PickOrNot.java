package Flipkart;

import java.util.*;
import java.lang.*;
import java.io.*;
    public class PickOrNot{
        public static void main(String[] args) throws java.lang.Exception{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            String[] sarr=br.readLine().split(" ");
            int N=Integer.parseInt(sarr[0]);
            int Y=Integer.parseInt(sarr[1]);
            sarr=br.readLine().split(" ");
            int[] x=new int[N];
            for(int i=0;i<N;i++){
                x[i]=Integer.parseInt(sarr[i]);
            }
            long cost=x[N-1]+Y;
            int z=1;
            for(int i=N-2;i>=0;i--){
                cost=cost+(((long)Math.pow(z+1,2))*(x[i+1]-x[i]));
                cost=cost+Y;
                z++;
            }
            int diff=x[0];
            cost=cost+(((long)Math.pow(z+1,2))*(diff));
            cost=cost+Y;
            System.out.println(cost);
        }
    }

