package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;
public class ConskEven {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int n,k;
        int[] res = new int[t];
        for (int i = 0; i < t; i++) {
            String[] sarr = br.readLine().split(" ");
            n = Integer.parseInt(sarr[0]);
            k = Integer.parseInt(sarr[1]);
            int[] arr=new int[n];
            sarr=br.readLine().split(" ");
            int count=0;
            for(int j=0;j<n;j++) {
                arr[j] = Integer.parseInt(sarr[j]);
            }
            if(n<k)
            {
                res[i]=0;
                continue;
            }
            for(int j=0;j<n;j++) {
                if(count==k)
                    res[i]=1;
                if(arr[j]%2==0)
                    count++;
                else
                    count=0;
            }

        }
        for(int i=0;i<t;i++)
            if(res[i]==1)
                System.out.println("YES");
            else
                System.out.println("NO");
    }
}