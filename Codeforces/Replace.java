package Codeforces;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Replace {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n=Integer.parseInt(br.readLine());
            if(n%2==0){
                for(int j=1;j<=n;j+=2){
                    System.out.print((j+1)+" "+j+" ");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=n-3;j+=2)
                    System.out.print((j+1)+" "+j+" ");
                System.out.println((n-1)+" "+n+" "+(n-2));
            }
        }
    }
}
