package codeChef.starters;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class ChefAndQuery  {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] sarr=br.readLine().split(" ");
        int n=Integer.parseInt(sarr[0]);
        int q=Integer.parseInt(sarr[1]);
        long[] arr=new long[n+1];
        sarr=br.readLine().split(" ");
        for(int i=1;i<=n;i++)
            arr[i]=Long.parseLong(sarr[i-1]);
        for(int i=0;i<q;i++){
            sarr=br.readLine().split(" ");
            if(Integer.parseInt(sarr[0])==1){
                int l=Integer.parseInt(sarr[1]);
                int r=Integer.parseInt(sarr[2]);
                int x=Integer.parseInt(sarr[3]);
                for(int j=l;j<=r;j++){
                    arr[j]+=((int)Math.pow((x+j-l),2));
                }
            }
            else{
                int index=Integer.parseInt(sarr[1]);
                System.out.println(arr[index]);
            }
        }
    }
}
/*
5 4
1 10 3 6 5
1 1 3 5
2 3
1 4 5 7
2 5
 */