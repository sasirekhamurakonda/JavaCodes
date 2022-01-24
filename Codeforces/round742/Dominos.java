package Codeforces.round742;


import java.util.*;
import java.lang.*;
import java.io.*;
public class Dominos{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            String temp=br.readLine();
            for(int j=0;j<n;j++){
                if(temp.charAt(j)=='U')
                    System.out.print("D");
                else if(temp.charAt(j)=='D')
                    System.out.print("U");
                else
                    System.out.print(temp.charAt(j));
            }
            System.out.println();
        }
    }
}
/*
inputCopy
4
1
U
2
LR
5
LRDLR
6
UUUUUU
outputCopy
D
LR
LRULR
DDDDDD
 */