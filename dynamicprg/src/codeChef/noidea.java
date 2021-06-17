package codeChef;


import java.util.*;
        import java.lang.*;
        import java.io.*;


class noidea
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        String[] sarr=br.readLine().split(" ");
        int sum=0;
        for(int i=0;i<n;i++) {
            arr[i] = Integer.parseInt(sarr[i]);
        }
        Arrays.sort(arr);
        int left=0,right=n-1;
        while(left<right){
            int min=Math.min(arr[left],arr[right]);
            sum=sum+(2*min);
            if(arr[left]==min){
                left++;
                arr[right]=arr[right]-min;
            }
            else{
                right--;
                arr[left]=arr[left]-min;
            }

        }
        if(left==right&&arr[left]>0)
          System.out.println(sum+1);
        else
            System.out.println(sum);
    }
}

