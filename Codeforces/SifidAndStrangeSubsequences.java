package Codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import java.util.*;
import java.lang.*;
import java.io.*;
public class SifidAndStrangeSubsequences {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] sarr = br.readLine().split(" ");
            for(int j=0;j<n;j++) {
                arr[j] = Integer.parseInt(sarr[j]);
            }
            Arrays.sort(arr);
            if(arr[0]>0||n==1)
                System.out.println("1");
            else{
                int j=0;
                int minDiff=Integer.MAX_VALUE;
                while(j+1<n&&arr[j]<=0&&arr[j+1]<=0){
                    if(arr[j+1]-arr[j]<minDiff){
                        minDiff=arr[j+1]-arr[j];
                    }
                    j++;
                }
                if(j==n-1&&arr[j]<0)
                    System.out.println("1");
                else if(j==n-1&&arr[j]==0){
                    System.out.println(n);
                }
                else {
                    int temp = j;
                    System.out.println(minDiff+" "+j);
                    for (int k = j; k < n; k++) {
                        if (arr[k - 1] <= arr[k])//1 1
                            break;
                        if (arr[k] <= minDiff)
                            temp++;
                    }
                    System.out.println(temp + 1);
                }
            }
        }
    }
}
