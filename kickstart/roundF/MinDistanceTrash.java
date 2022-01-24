package kickstart.roundF;

import java.util.*;
import java.lang.*;
import java.io.*;
public class MinDistanceTrash
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            String s=br.readLine();
            int j=0;
            int[] left=new int[n];
            int[] right=new int[n];
            long sum=0;
            while(j<n){
                if(s.charAt(j)=='1'){
                    left[j]=j;
                }
                else{
                    if(j==0){
                        while(j<n&&s.charAt(j)=='0'){
                            j++;
                        }
                        int k=0;
                        while(k<=j){
                            left[k]=j;
                            k++;
                        }
                    }
                    else{
                        left[j]=left[j-1];
                    }
                }
                j++;
            }
            j=n-1;
            while(j>=0){
                if(s.charAt(j)=='1'){
                    right[j]=j;
                }
                else{
                    if(j==n-1){
                        while(j>=0&&s.charAt(j)=='0'){
                            j=j-1;

                        }

                        int k=j;
                        while(k<n){
                            right[k]=j;
                            k++;
                        }
                    }
                    else
                        right[j]=right[j+1];
                }
                j--;
            }
            for(int k=0;k<n;k++){
                sum+=Math.min(Math.abs(k-left[k]),Math.abs(k-right[k]));
            }
            System.out.println("Case #"+(i+1)+": "+sum);
        }

    }
}
/*
Sample Input
save_alt
content_copy
2
3
111
6
100100
Sample Output
save_alt
content_copy
Case #1: 0
Case #2: 5
 */