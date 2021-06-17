package Codeforces;


import java.util.*;
import java.lang.*;
import java.io.*;
public class ArrayReordering{
    public static int findGCD(int n1,int n2){
        while(n1 != n2) {

            if(n1 > n2) {
                n1 -= n2;
            }

            else {
                n2 -= n1;
            }
        }
        return n2;
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
            Arrays.sort(arr);
            long count=0;
            for(int j=n-1;j>0;j--){
                if(arr[j]%2==0){
                    count=count+(j);
                }
                else if(arr[j]>1){
                    for(int k=0;k<j;k++){
                        if(findGCD(2*arr[k],arr[j])>1){
                            count=count+1;
                        }
                    }
                }
            }
            System.out.println(count);

        }
    }

}
/*
3
4
3 6 5 3
2
1 7
5
1 4 2 4 1


1 7 21 14 35
 */