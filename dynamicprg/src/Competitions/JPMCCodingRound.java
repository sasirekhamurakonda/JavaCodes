package Competitions;


import java.util.*;
        import java.lang.*;
        import java.io.*;
public class JPMCCodingRound {
    public static void findingOut(String string){
        int prev =0,curr = 1;
        int ans =0;
        for(int i=1;i<string.length();i++){
            if(string.charAt(i-1)==string.charAt(i))curr++;
            else{
                prev = curr;
                curr = 1;
            }
            if(curr<=prev)ans++;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String s=br.readLine();
            findingOut(s);
        }

    }
}
