package Codeforces.round767;


import java.util.*;
import java.lang.*;
import java.io.*;
public class DownloadMoreRam {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String[] sarr = br.readLine().split(" ");
            int n=Integer.parseInt(sarr[0]);
            int k=Integer.parseInt(sarr[1]);
            int[][] arr = new int[n][2];
            sarr = br.readLine().split(" ");
            String[] sarr2=br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr[j][0]=Integer.parseInt(sarr[j]);
                arr[j][1]=Integer.parseInt(sarr2[j]);
            }
            Arrays.sort(arr,(a,b)->a[0]-b[0]);
            int index=0;
            while(index<n && arr[index][0]<=k){
                k=k+arr[index][1];
                index++;
            }
            System.out.println(k);
        }

    }
}
