package kickstart;

import java.util.*;
import java.lang.*;
import java.io.*;
public class StrictlyIncreasing {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n;
        for(int i=0;i<t;i++){
            n=Integer.parseInt(br.readLine());
            String s=br.readLine();
            System.out.print("1 ");
            int val=1;
            for(int j=1;j<n;j++){
                if(s.charAt(j)>s.charAt(j-1)){
                    val++;
                }
                else{
                    val=1;
                }
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}