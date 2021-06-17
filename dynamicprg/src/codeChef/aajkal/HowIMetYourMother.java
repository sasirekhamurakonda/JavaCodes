package codeChef.aajkal;

import java.util.*;
import java.lang.*;
import java.io.*;
public class HowIMetYourMother  {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        long x1,x2,x3,r;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            x1=Long.parseLong(sarr[0]);
            x2=Long.parseLong(sarr[1]);
            x3=Long.parseLong(sarr[2]);
            r=Long.parseLong(sarr[3]);
            long res=0;

            if((x1<=x3&&x3<=x2)||(x1>=x3&&x3>=x2)){
                if(Math.abs(x3)+r<Math.abs(x1))
                    res=res+Math.abs(x1)-Math.abs(x3)-r;
                if(Math.abs(x3)+r<Math.abs(x2))
                    res=res+Math.abs(x2)-Math.abs(x3)-r;
            }
            System.out.println(res);

        }
    }
}