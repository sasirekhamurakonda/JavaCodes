package Codeforces.round730;


import java.util.*;
import java.lang.*;
import java.io.*;
public class CustomizeTheTrack{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] sarr = br.readLine().split(" ");
            long sum=0;
            for (int j = 0; j < n; j++) {
                arr[j] = Integer.parseInt(sarr[j]);
                sum=sum+arr[j];
            }
            long mod=sum%n;
            long diff=n-mod;
            System.out.println(mod*diff);

        }
    }
}

/*
3
3
1 2 3
4
0 1 1 0
10
8 3 6 11 5 2 1 7 10 4
 */