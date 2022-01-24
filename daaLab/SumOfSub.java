package daaLab;

import java.io.*;
        import java.lang.*;
        import java.util.*;
public class SumOfSub{
    public static int[] x;
    public static int[] w;
    public static int m;
    public static void printArray(int n){
        for(int i=0;i<n;i++){
            if(x[i]==1)
                System.out.print(w[i]+" ");
        }
        System.out.println();
    }
    public static void sumOfSub(int s,int k,int r,int n){
        //if(k<n-1) {
            x[k] = 1;
            if (s + w[k] == m)
                printArray(n);
            else if (s + w[k] + w[k + 1] <= m)
                sumOfSub(s + w[k], k + 1, r - w[k],n);
            if ((s + r - w[k] >= m) && (s + w[k + 1] <= m)) {
                x[k] = 0;
                sumOfSub(s, k + 1, r - w[k],n);
            }
        //}
    }
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size of the Array: ");
        int n=Integer.parseInt(br.readLine());
        w=new int[n];
        int r=0;
        System.out.println("Enter the Array Elements:");
        String[] sarr=br.readLine().split(" ");
        for(int i=0 ;i<n;i++) {
            w[i] = Integer.parseInt(sarr[i]);
            r=r+w[i];
        }
        Arrays.sort(w);
        for(int i=0;i<n;i++)
            System.out.print(w[i]+" ");
        System.out.println();
        x=new int[n];
        System.out.print("Enter the sum: ");
        m=Integer.parseInt(br.readLine());
        sumOfSub(0,0,r,n);
    }
}
/*
import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class SumOfSub
{
    static int[] w;
    static int[] x;
    static int sum,count=0;
    public static void subset(int s,int k,int r)
    {
        int i=0;
        x[k]=1;
        if(s+w[k]==sum)
        {
            System.out.println("solution:"+(++count));
            for(i=1;i<=k;i++)
            {
                //System.out.print(x[i]+" ");
                if(x[i]==1)
                    System.out.print(w[i]+" ");
            }
            System.out.println();
        }
        else if((s+w[k]+w[k+1]) <= sum)
        {
            subset(s+w[k],k+1,r-w[k]);
        }
        if((s+r-w[k])>=sum && (s+w[k+1])<=sum)
        {
            x[k]=0;
            subset(s,k+1,r-w[k]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n=sc.nextInt();
        w=new int[n+1];
        x=new int[n+1];
        for(int i=1;i<n+1;i++)
        {
            x[i]=0;
        }
        int total=0;
        System.out.println("Enter " + n + " Elements : (in ascending order)");
        for(int i=1;i<n+1;i++)
        {
            w[i]=sc.nextInt();
            total+=w[i];
        }
        System.out.println("Enter the sum to be obtained: ");
        sum = sc.nextInt();
        if(total<sum)
        {
            System.out.println("Not possible to obtain the subset!!!");
            System.exit(1);
        }
        subset(0,1,total);
    }
}*/