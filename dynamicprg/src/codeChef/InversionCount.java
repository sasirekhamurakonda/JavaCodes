package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InversionCount {
    public static int inversionCount(int[] arr,int n){
        int inversionCount=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    inversionCount++;
                }
            }
        }
        return inversionCount;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        String[] sarr=br.readLine().split(" ");
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(sarr[i]);
        System.out.println(inversionCount(arr,n));
    }
}
