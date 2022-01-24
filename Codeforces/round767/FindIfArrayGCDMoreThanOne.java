package Codeforces.round767;

import java.util.*;
import java.lang.*;
import java.io.*;
public class FindIfArrayGCDMoreThanOne{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        long l,r,k;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            l=Long.parseLong(sarr[0]);
            r=Long.parseLong(sarr[1]);
            k=Long.parseLong(sarr[2]);
            if(l==r){
                if(l==1)
                    System.out.println("NO");
                else
                    System.out.println("YES");
            }
            else if(k==0){
                System.out.println("NO");
            }
            else{
                long diff=(r-l)+1;
                if(diff%2!=0 && l%2!=0){
                    if(k>=(diff/2)+1)
                        System.out.println("YES");
                    else
                        System.out.println("NO");
                }
                else{
                    if(k>=diff/2){
                        System.out.println("YES");
                    }
                    else
                        System.out.println("NO");

                }
            }

        }
    }
}
/*
9
1 1 0
3 5 1
13 13 0
4 4 0
3 7 4
4 10 3
2 4 0
1 7 3
1 5 3


NO
NO
YES
YES
YES
YES
NO
NO
YES

 */