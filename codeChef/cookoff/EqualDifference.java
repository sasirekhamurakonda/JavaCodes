package codeChef.cookoff;



import java.util.*;
import java.lang.*;
import java.io.*;


class EqualDifference
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] sarr = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                arr[j] = Integer.parseInt(sarr[j]);
            Arrays.sort(arr);
            int count=1;
            int noOfRemoval=0;
            int maxCount=1;
            int minOfRemovals=Integer.MAX_VALUE;
            for(int j=1;j<n;j++){

            }

        }

    }
}