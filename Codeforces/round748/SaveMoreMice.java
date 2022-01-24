package Codeforces.round748;

import java.util.*;
import java.lang.*;
import java.io.*;
public class SaveMoreMice {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String[] sarr = br.readLine().split(" ");
            int n=Integer.parseInt(sarr[0]);
            int m=Integer.parseInt(sarr[1]);
            int[] arr = new int[m];
            sarr = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                arr[j] = Integer.parseInt(sarr[j]);
            }
            Arrays.sort(arr);
            int currpos=0;
            int count=0;
            for(int j=m-1;j>=0;j--){
                if(arr[j]>currpos){
                    currpos+=(n-arr[j]);
                    count++;
                }
                else{
                    break;
                }
            }
            System.out.println(count);

        }
    }
}