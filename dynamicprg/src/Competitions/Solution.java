package Competitions;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int findMaxPaths(int[][] g,boolean[][] vis,int i,int j,int x,int y,int res){
        if((i>x||j>y))
            return res;
        if(g[i][j]==0)
            return res;
        if(i==x&&j==y)
            return res+1;
        vis[i][j]=true;
        int resR=0,resD=0,resRB=0;
        //for(int q=j+1;q<=m;q++)
        resR=findMaxPaths(g,vis,i,j+1,x,y,res);
        //for(int p=i+1;p<=n;p++)
        resD=findMaxPaths(g,vis,i+1,j,x,y,res);
        //for(int p=i+1,q=j+1;p<=n&&q<=m;p++,q++)
        resRB=findMaxPaths(g,vis,i+1,j+1,x,y,res);
        vis[i][j]=false;
        res+=(resR+resD+resRB);
        return res;
    }
    public static void main(String[] args)throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,m;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] sarr=br.readLine().split(" ");
        n=Integer.parseInt(sarr[0]);
        m=Integer.parseInt(sarr[1]);
        int[][] g=new int[n][m];
        for(int i=0;i<n;i++){
            String s=br.readLine();
            for(int j=0;j<m;j++){
                if(s.charAt(j)=='.')
                    g[i][j]=1;
                else
                    g[i][j]=0;
            }
        }
        boolean vis[][]=new boolean[n][m];
        int res=findMaxPaths(g,vis,0,0,n-1,m-1,0);
        System.out.println(((res*2)+1));
    }
}
