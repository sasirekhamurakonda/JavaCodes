package Codeforces.vkcup;


import java.util.*;
        import java.lang.*;
        import java.io.*;
public class MakeItSorted{
    public static boolean isSorted(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1])return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] sarr = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                arr[j] = Integer.parseInt(sarr[j]);
            int x=0;
            int count=0;
            while(true){
                if(makeChanges(arr,n,x)==0){
                    if(isSorted(arr,n)){
                        break;
                    }
                }
                count++;
                if(isSorted(arr,n)){
                    break;
                }
                x=(x==0)?(1):(0);

            }
            System.out.println(count);
        }
    }

    private static int makeChanges(int[] arr, int n,int index) {
        int count=0;
        for(int i=index;i<n-1;i+=2){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                count=1;
            }
        }
        return count;
    }
}
/*
Example
inputCopy
3
3
3 2 1
7
4 5 7 1 3 2 6
5
1 2 3 4 5
outputCopy
3
5
0
 */