package Flipkart;


import java.util.*;
import java.lang.*;
import java.io.*;
public class PalindromeSubstring2{
    public static boolean isPalindrome(String s){
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
    public static int getMinCuts(String s) {
        int n=s.length();
        int[][] dp=new int[n][n];
        //to set all l=1 to zeroes
        for(int i=0;i<n;i++){
            dp[i][i]=0;
        }
        //to set all l=2 to respective values
        for(int l=2;l<=n;l++){
            for(int i=0;i<n-l+1;i++){
                int j=i+l-1;
                if(isPalindrome(s.substring(i,j+1))){
                    //System.out.println(s.substring(i,j+1));
                    dp[i][j]=0;
                }
                else{
                    dp[i][j]=1;
                    int min=Integer.MAX_VALUE;
                    for(int k=i;k<(i+l-1);k++){
                        min=Math.min(min,(dp[i][k]+dp[k+1][j]));
                    }
                    dp[i][j]+=min;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
                System.out.print(dp[i][j]+" ");
            System.out.println();
        }
        return dp[0][n-1];
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        System.out.println(getMinCuts(s));
    }
}