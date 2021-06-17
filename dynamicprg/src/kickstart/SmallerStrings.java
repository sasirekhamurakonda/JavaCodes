package kickstart;


import java.util.*;
import java.lang.*;
import java.io.*;
public class SmallerStrings{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n,k;
        int[] res=new int[t];
        String s="abcdefghijklmniopqrstuvwxyz";
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            k=Integer.parseInt(sarr[1]);
            String limit=br.readLine();
            char[] data=new char[n+1];
            System.out.println("Case #"+(i+1)+": "+findAllPerm(limit,n,s.substring(0,k),0,data));

        }
    }

    private static int findAllPerm(String limit, int n, String substring,int index,char[] data) {
        int res=0;
        int mod=1000000007;
        for(int i=0;i<substring.length();i++){
            data[index]=substring.charAt(i);
            if(index==n-1) {
                String s = new String(data);
                //System.out.println(s);
                if (index == n - 1 && s.compareTo(limit)>0) {
                    return res;
                }
                if (index == n - 1 && isPalindrome(data,n)&&s.compareTo(limit)>0) {
                    //System.out.println(s);
                    return res;
                }
                if (index == n - 1 && isPalindrome(data,n)&&s.compareTo(limit)<0) {
                    //System.out.println(s);
                    res=res+1;
                }
            }
            else {
                res=(res%mod+findAllPerm(limit, n, substring, index + 1, data)%mod)%mod;
            }
        }
        return res;
    }

    private static boolean isPalindrome(char[] data,int n) {
        for(int i=0;i<n;i++){
            if(data[i]!=data[n-1-i])
                return false;
        }
        return true;
    }
}