package codeChef.cookoffJan2022;


import java.util.*;
import java.lang.*;
import java.io.*;
class BurgerOrPizza
{

    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int x,y,z;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            x=Integer.parseInt(sarr[0]);
            y=Integer.parseInt(sarr[1]);
            z=Integer.parseInt(sarr[2]);
            if(y<=x){
                System.out.println("PIZZA");
            }
            else if(z<=x){
                System.out.println("BURGER");
            }
            else{
                System.out.println("NOTHING");
            }

        }

    }
}