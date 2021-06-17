package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Score2020  {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int r,o,c;
        String[] sarr=br.readLine().split(" ");
        r=Integer.parseInt(sarr[0]);
        o=Integer.parseInt(sarr[1]);
        c=Integer.parseInt(sarr[2]);
        int x=c-r;
        if(x>(o*6)){
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }

    }
}