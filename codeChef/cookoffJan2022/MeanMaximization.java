package codeChef.cookoffJan2022;


import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.*;
import java.lang.*;
import java.io.*;
public class MeanMaximization{
    public static void findMeanMax(int[] arr,int n){
        int max=arr[0];
        long sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        sum=sum-max;
        double avg=(1.0*sum)/(n-1);
        avg=avg+max;

        System.out.format("%.6f", avg);
        System.out.println();
        //avg=(double)Math.round(avg * 1000000d) / 1000000d;
        //DecimalFormat df = new DecimalFormat(".######");
        //df.setRoundingMode(RoundingMode.CEILING);
        //System.out.println(df.format(avg));
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] sarr = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                arr[j] = Integer.parseInt(sarr[j]);
            findMeanMax(arr,n);
        }
    }
}
