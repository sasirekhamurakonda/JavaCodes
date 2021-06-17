package Codeforces;


import java.util.*;
import java.lang.*;
import java.io.*;
public class AliveAndMakeAlive{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String[] sarr = br.readLine().split(" ");
            int n=Integer.parseInt(sarr[0]);
            long m=Long.parseLong(sarr[1]);
            int[] arr = new int[n];
            int[] arrc = new int[n];
            String s = br.readLine();
            int zeroes=0;
            for (int j = 0; j < n; j++) {
                arr[j] = s.charAt(j)-'0';
                arrc[j] = s.charAt(j)-'0';
                if(arr[j]==0)
                    zeroes++;
            }
            if(zeroes==n){
                for(int j=0;j<n;j++)
                    System.out.print("0");
                System.out.println();
            }
            else {
                for(int j=0;j<n;j++){
                    if(arrc[j]==1){
                        if(j>0&&arrc[j-1]==0){
                            long x=m;
                            int k=j-1;
                            while (k > 0 && arrc[k-1] == 0&& x>0){
                                arr[k]=1;
                                x--;
                                k--;
                            }
                            if(k==0){
                                arr[k]=1;
                            }
                        }
                        if(j<n-1&&arrc[j+1]==0){
                            long x=m;
                            int k=j+1;
                            while(k<n-1&&arrc[k+1]==0&&x>0){
                                arr[k]=1;
                                x--;
                                k++;
                            }
                            if(k==n-1){
                                arr[k]=1;
                            }
                            j=k-1;
                        }
                    }

                }
                for(int j=0;j<n;j++)
                    System.out.print(arr[j]);
                System.out.println();
            }
        }
    }
}
/*

inputCopy
4
11 3
01000000001
10 2
0110100101
5 2
10101
3 100
000
outputCopy
11111001111
1110111101
10101
000
for(int j=0;j<m;j++){
                    int[] temp=new int[n];
                    if (n >= 0) System.arraycopy(arr, 0, temp, 0, n);
                    for(int k=0;k<n;k++) {
                        if (arr[k] == 0) {
                            if (k == 0 || k == n - 1) {
                                temp[k] = 1;
                            } else {
                                if((arr[k-1]==1&&arr[k+1]==0)||(arr[k-1]==0&&arr[k+1]==1)){
                                    temp[k]=1;
                                }
                            }
                        }
                    }
                    if (n >= 0) System.arraycopy(temp, 0, arr, 0, n);
                }
                00011000000101
 */