package codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.*;
import java.lang.*;
import java.io.*;
public class EquinoxString {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n;
        long a,b;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            a=Long.parseLong(sarr[1]);
            b=Long.parseLong(sarr[2]);
            long sar=0,anu=0;
            for(int j=0;j<n;j++) {
                String s = br.readLine();
                if (s.charAt(0) == 'E' || s.charAt(0) == 'Q' || s.charAt(0) == 'U' || s.charAt(0) == 'I' || s.charAt(0) == 'N' || s.charAt(0) == 'O' || s.charAt(0) == 'X') {
                    sar += a;
                } else {
                    anu += b;
                }
            }
            if(sar>anu){
                System.out.println("SARTHAK");
            }
            else if(sar<anu){
                System.out.println("ANURADHA");
            }
            else
                System.out.println("DRAW");
        }
    }
}