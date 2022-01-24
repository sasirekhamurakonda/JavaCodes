package codeChef.starters;

import java.util.*;
import java.lang.*;
import java.io.*;
public class SleepPerfect {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String[] sarr = br.readLine().split(" ");
            int l=Integer.parseInt(sarr[0]);
            int h=Integer.parseInt(sarr[1]);
            String s=br.readLine();
            long counter=s.chars().filter(ch->ch=='0').count();

            if(counter<h)
                System.out.println("NO");
            else{
                int x=0;
                boolean found=false;
                for(int j=0;j<l;j++){
                    if(s.charAt(j)=='0'){
                        int zc=1;
                        int k=j+1;
                        while(k<l&&s.charAt(k)=='0'){
                            k++;
                            zc++;
                        }
                        //System.out.println("starting "+j+" "+zc+" "+k+" "+h);
                        if(zc>=h) {
                            System.out.println("YES");
                            found=true;
                            break;
                        }
                        else{
                            x=h;
                            h=h-zc;
                            h=(2*(x-zc));
                            if(x<h){
                                h=x;
                            }
                        }
                        j=k-1;
                        //System.out.println("Ending "+j+" "+zc+" "+k+" "+h);
                    }
                }
                if(!found)
                    System.out.println("NO");
            }

        }
    }
}
/*
4
3 1
111
3 1
101
7 5
0000100
6 5
000010
 */