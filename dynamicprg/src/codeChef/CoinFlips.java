package codeChef;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class CoinFlips {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int I, n, q;
        int[][] res = new int[t][];
        int[] g=new int[t];
        for (int i = 0; i < t; i++) {
            g[i]=Integer.parseInt(br.readLine());
            res[i]=new int[g[i]];
            for(int j=0;j<g[i];j++) {
                String[] sarr = br.readLine().split(" ");
                I = Integer.parseInt(sarr[0]);
                n = Integer.parseInt(sarr[1]);
                q = Integer.parseInt(sarr[2]);
                if(n%2==0){
                    res[i][j]=n/2;
                }
                else{
                    if(q==I){
                        res[i][j]=n/2;
                    }
                    else
                        res[i][j]=n/2+1;
                }
            }
        }
        for(int i=0;i<t;i++){
            for(int j=0;j<g[i];j++)
                System.out.println(res[i][j]);
        }
    }
}