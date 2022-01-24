package Codeforces.round748;


import java.util.*;
        import java.lang.*;
        import java.io.*;
public class AllAreSame{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] sarr = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                arr[j] = Integer.parseInt(sarr[j]);
            Arrays.sort(arr);
            int minDiff=Integer.MAX_VALUE;
            for(int j=1;j<n;j++){
                if(arr[j]-arr[j-1]>0){
                    minDiff=Math.min(arr[j]-arr[j-1],minDiff);
                }
            }
            if(minDiff>=2000000)
                System.out.println("-1");
            else
            System.out.println(minDiff);
        }
    }
}