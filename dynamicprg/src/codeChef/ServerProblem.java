package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;
public class ServerProblem {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n,k;
        int[][] res=new int[t][2];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            k=Integer.parseInt(sarr[1]);
            if(n%k==0){
                res[i][0]=n/k;
                res[i][1]=k;
            }
            else{
                res[i][0]=n/k+1;
                res[i][1]=n%k;
            }
        }
        for(int i=0;i<t;i++)
            System.out.println(res[i][0]+" "+res[i][1]);
    }
}