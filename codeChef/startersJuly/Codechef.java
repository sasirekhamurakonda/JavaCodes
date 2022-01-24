package codeChef.startersJuly;

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main (String[] args) throws java.lang.Exception
    {
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            findOptimalX();
        }
    }
    public static void findOptimalX()throws java.lang.Exception{
        //double a,b;
        long a,b;
        String[] sarr=br.readLine().split(" ");
        //a=Double.parseDouble(sarr[0]);
        //b=Double.parseDouble(sarr[1]);
        a=Long.parseLong(sarr[0]);
        b=Long.parseLong(sarr[1]);
        if(a==b) System.out.println("0");
        else{
            if(a<b) {
                long diffavg = (b - a) / 2;
                if ((b - a) % 2 != 0) {
                    System.out.println(diffavg + 1);
                } else {
                    if (diffavg % 2 == 0)
                        System.out.println(diffavg);
                    else {
                        System.out.println(diffavg + 1);
                    }
                }
            }
            else{
                long diffavg = (a-b) / 2;
                if ((b - a) % 2 != 0) {
                    System.out.println(-1*(diffavg));
                } else {
                    if (diffavg % 2 == 0)
                        System.out.println(-1*(diffavg));
                    else {
                        System.out.println(-1*(diffavg));
                    }
                }
            }

        }
//        else{
//            System.out.println((int)(Math.ceil(((double)(mid-a))/2)+Math.ceil(((double)(b-mid))/2)));
//        }
    }
    public static void findMaxLevel()throws java.lang.Exception{
        int a,b;
        String[] sarr=br.readLine().split(" ");
        a=Integer.parseInt(sarr[0]);
        b=Integer.parseInt(sarr[1]);
        int max=0;
        while(a>0){
            a=a/b;
            max++;
        }
        System.out.println(max);
    }
    public static void findMaxXor()throws java.lang.Exception{
        int n,k;
        String[] sarr=br.readLine().split(" ");
        n=Integer.parseInt(sarr[0]);
        k=Integer.parseInt(sarr[1]);
        long val=0;
        long max=1L<<n-1;
        long maxi=Math.min(max,k);
        val=(maxi*2)*(max*2-1);
        System.out.println(val);
    }

}
