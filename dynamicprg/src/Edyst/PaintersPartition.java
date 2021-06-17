package Edyst;
import java.util.*;
import java.lang.*;
import java.io.*;
public class PaintersPartition {
    public static int solution(int k,int t,int[] arr){
        int sum=0;
        int mod=10000003;
        int n=arr.length;
        for(int i=0;i<n;i++){
            sum=(sum%mod+arr[i]%mod)%mod;
        }
        if(k==2){
            int range=sum/k;
            int cur_sum=0;
            int i=0;
            while(cur_sum<=range){
                cur_sum=(cur_sum%mod+arr[i]%mod)%mod;
                i++;
            }
            sum=cur_sum;
        }
        sum=(sum%mod*t%mod)%mod;
        return sum;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int k=Integer.parseInt(br.readLine());
        int t=Integer.parseInt(br.readLine());
        String[] sarr=br.readLine().split(" ");
        int[] arr=new int[sarr.length];
        for(int i=0;i<arr.length;i++)
            arr[i]=Integer.parseInt(sarr[i]);
        System.out.println(solution(k,t,arr));
    }
}
