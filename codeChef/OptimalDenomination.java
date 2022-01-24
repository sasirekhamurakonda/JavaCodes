package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;
public class OptimalDenomination{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr=new int[n];
            String[] sarr = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                arr[i]=Integer.parseInt(sarr[j]);
            Arrays.sort(arr);
            if(n==1){
                System.out.println(arr[0]);
            }
            else {
                long min = 0;
                boolean notfound=false;
                int first = arr[0];
                for (int j = 1; j < n - 1; j++) {
                    if (arr[j] % first == 0) {
                        min+=(arr[j]/first);
                    }
                    else{
                        notfound=true;
                    }
                }
                if(!notfound){
                    min=min+1;

                }
            }
        }
    }
}