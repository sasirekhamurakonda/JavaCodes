package Codeforces;

import java.util.*;
import java.lang.*;
import java.io.*;
public class EshagLoveBigArray {
    public static void main(String[] args) throws IOException{
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
            int min=arr[0];
            int j=0;
            for(j=0;j<n;j++){
                if(arr[j]>min)
                    break;
            }
            int count=n-j;
            System.out.println(count);

        }
    }
}

