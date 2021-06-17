package Quora;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class digest {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] sarr=br.readLine().split(" ");
        int n=Integer.parseInt(br.readLine());
        int m=Integer.parseInt(br.readLine());
        int[] stories=new int[n];
        for(int i=0;i<n;i++){
            stories[i]=Integer.parseInt(br.readLine());
        }
        sarr=br.readLine().split(" ");
        int p=Integer.parseInt(br.readLine());
        int q=Integer.parseInt(br.readLine());
        int[][] ifollowj=new int[p][2];
        int[][] jfollowst=new int[q][2];
        for(int i=0;i<p;i++){
            sarr=br.readLine().split(" ");
            ifollowj[i][0]=Integer.parseInt(br.readLine());
            ifollowj[i][1]=Integer.parseInt(br.readLine());
        }
        for(int i=0;i<q;i++){
            sarr=br.readLine().split(" ");
            jfollowst[i][0]=Integer.parseInt(br.readLine());
            jfollowst[i][1]=Integer.parseInt(br.readLine());
        }

    }
}