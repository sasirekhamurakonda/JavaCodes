package codeChef;

import java.util.*;
import java.lang.*;
import java.io.*;
public class TicTacToe{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            String a=br.readLine();
            String b=br.readLine();
            String c=br.readLine();
            int x=count(a,'X')+count(b,'X')+count(c,'X');
            int o=count(a,'O')+count(b,'O')+count(c,'O');
            int underscore=count(a,'_')+count(b,'_')+count(c,'_');
            if(x>o+1||x<o)
                System.out.println("3");
            else{
                int xwins=wins(a,b,c,"XXX");
                int owins=wins(a,b,c,"OOO");
                if(xwins>0&&owins>0)
                    System.out.println("3");
                else if(xwins>1||owins>1)
                    System.out.println("3");
                else{
                    if(xwins==0&&owins==0){
                        if(underscore>=1)
                            System.out.println("2");
                        else
                            System.out.println("1");
                    }
                    if(xwins==1&&owins==0)
                        System.out.println("1");
                    else if(xwins==0&&owins==1)
                        System.out.println("1");
                }
            }

        }
    }

    private static int wins(String a,String b,String c,String x) {
        int wins=0;
        if(a.equals(x))
            wins+=1;
        if(b.equals(x))
            wins+=1;
        if(c.equals(x))
            wins+=1;
        for(int i=0;i<3;i++){
            if(a.charAt(i)==x.charAt(0)&&b.charAt(i)==x.charAt(1)&&c.charAt(i)==x.charAt(2))
                wins+=1;
        }
        if(a.charAt(0)==x.charAt(0)&&b.charAt(1)==x.charAt(1)&&c.charAt(2)==x.charAt(2))
            wins+=1;
        if(a.charAt(2)==x.charAt(0)&&b.charAt(1)==x.charAt(1)&&c.charAt(0)==x.charAt(2))
            wins+=1;
        return wins;

    }

    private static int count(String a, char x) {
        int count=0;
        for(int i=0;i<3;i++)
            if(a.charAt(i)==x)
                count++;
        return count;

    }
}