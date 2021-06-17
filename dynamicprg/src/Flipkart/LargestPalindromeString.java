package Flipkart;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class LargestPalindromeString{
    public static String getLongestPalindrome(String s) {
        // add logic to code
        int len=0,max=0,start=-1;
        if(s.length()==1||s.length()==0)
            return s;
        for(int i=0;i<s.length()-1;i++){
            for(int j=s.length()-1;j>i;j--){
                if(s.charAt(i)==s.charAt(j)){
                    int k=i,l=j;
                    while(k<l&&s.charAt(k)==s.charAt(l)){
                        k++;
                        l--;
                    }
                    if(k>=l){
                        if(j-i+1>max){
                            start=i;
                            max=j-i+1;
                        }
                    }
                }
            }
        }
        return s.substring(start,start+max);
    }
    /*public static String getLongestPalindrome(String s) {
        // add logic to code
        int len=0,max=0,start=0;
        if(s.length()==1||s.length()==0)
            return s;
        for(int i=0;i<s.length();i++){
            for(int j=s.length()-1;j>i;j--){
                if(s.charAt(i)==s.charAt(j)){
                    int k=i,l=j;
                    while(k<l&&s.charAt(k)==s.charAt(l)){
                        k++;
                        l--;
                    }
                    if(k>=l){
                        if(j-i+1>max){
                            start=i;
                            max=j-i+1;
                        }
                    }
                }
            }
        }
        if(max==0) {
            //System.out.println("Returning null");
            return "";
        }
        return s.substring(start,start+max);
    }*/
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String s = br.readLine();
            System.out.println(getLongestPalindrome(s));
        }
    }
}