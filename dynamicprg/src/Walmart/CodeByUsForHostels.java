package Walmart;


import java.util.*;
import java.lang.*;
import java.io.*;
public class CodeByUsForHostels{
    public static int maxHostels(int[][] arr,int days,int index,int n,boolean[] occupied){
        if(days==0)return 0;
        if(index>=n)return 0;
        if(ifPossible(occupied,index,arr,days,n)){
            System.out.println("Inside="+arr[index][0]+" "+arr[index][1]);
            for(int z=0;z<occupied.length;z++)
                System.out.print(occupied[z]+" ");
            System.out.println();
            boolean[] temp=occupied;
            int i=0;
            for(i=arr[index][0];i<occupied.length;i++){
                if(!occupied[i])
                    break;
            }
            for(int j=i;j<arr[index][1]+i;j++){
                occupied[j]=true;
            }
            return Math.max(1+maxHostels(arr,days-arr[index][1],index+1,n,occupied),maxHostels(arr,days,index+1,n,temp));
        }
        return maxHostels(arr,days,index+1,n,occupied);

    }

    private static boolean ifPossible(boolean[] occupied, int index, int[][] arr, int days, int n) {
        if(days<arr[index][1])return false;
        int maxpossible=0;
        int possible=0;
        for(int i=arr[index][0];i<occupied.length;i++){
            if(!occupied[i])
                possible++;
            else{
                if(maxpossible<possible)
                    maxpossible=possible;
                possible=0;
            }
        }
        return maxpossible>=arr[index][1];
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String[] sarr = br.readLine().split(" ");
            int n=Integer.parseInt(sarr[0]);
            int k=Integer.parseInt(sarr[1]);
            int[][] arr = new int[n][2];
            for (int j = 0; j < n; j++) {
                sarr = br.readLine().split(" ");
                arr[j][0] = Integer.parseInt(sarr[0]);
                arr[j][1] = Integer.parseInt(sarr[1]);
            }
            Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
            for(int j=0;j<n;j++)
                System.out.println(arr[j][0]+" "+arr[j][1]);
            boolean[] res=new boolean[k+1];
            int result=maxHostels(arr,k,0,n,res);
            System.out.println(result);
        }
    }
}
