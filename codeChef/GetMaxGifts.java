package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;
public class GetMaxGifts{
    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String[] sarr = br.readLine().split(" ");
            int n=Integer.parseInt(sarr[0]);
            int k=Integer.parseInt(sarr[1]);
            ArrayList<Long> arr=new ArrayList<>();
            sarr = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                arr.add(Long.parseLong(sarr[j]));
            }
            Collections.sort(arr,Collections.reverseOrder());
            long odd=0,even=0;
            for(int j=0;j<2*k;j+=2){
                even+=arr.get(j);
                odd+=arr.get(j+1);
            }
            odd+=arr.get(2*k);
            System.out.println(Math.max(odd,even));

        }
    }
}/*
3
3 1
1 3 2
3 1
3 1 3
5 2
5 1 3 2 4
 */