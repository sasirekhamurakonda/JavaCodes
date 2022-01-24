package kickstart;


import java.util.*;
import java.lang.*;
import java.io.*;
public class ArithmeticArray {
    public static int lengthOfSubArray(int[] A,int n){
        int[] arr=A;
        int max=1;
        int count=0;
        boolean used=false;
        for(int j=0;j<n-1;j++){
            arr=A;
            count=2;
            int diff=arr[j+1]-arr[j];
            //System.out.println("diff= "+diff);
            for(int k=j+2;k<n;k++){
                if(arr[k]-arr[k-1]==diff){
                    count++;
                }
                else if(!used){
                    arr[k]=arr[k-1]+diff;
                    count++;
                    used=true;
                }
                else
                    break;
            }
            //System.out.println("after loop "+diff+" "+count);
            if(count>max){
                max=count;
            }

        }
        return max;

    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n;
        for(int i=0;i<t;i++) {
            n = Integer.parseInt(br.readLine());
            String[] sarr = br.readLine().split(" ");
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=Integer.parseInt(sarr[j]);
            }
            int res=lengthOfSubArray(arr,n);
            System.out.println("Case #"+(i+1)+": "+res);
        }

    }
}