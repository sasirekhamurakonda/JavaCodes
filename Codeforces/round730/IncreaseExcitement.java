package Codeforces.round730;


import java.util.*;
        import java.lang.*;
        import java.io.*;


class IncreaseExcitement
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        long n1,n2;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n1=Long.parseLong(sarr[0]);
            n2=Long.parseLong(sarr[1]);
            if(n1 - n2 == 0){
                System.out.println("0 0");
            }
            else{
                if(n1==0){
                    System.out.println(n2+" 0");
                }
                else if(n2==0){
                    System.out.println(n1+" 0");
                }
                else {
                    long diff = Math.abs(n1 - n2);
                    if(diff==1){
                        System.out.println("1 0");
                    }
                    else{
                        long x = diff - (n1 % diff);
                        long y=n1%diff;
                        if(x<y)
                            System.out.println(diff + " " + x);
                        else
                            System.out.println(diff+" "+y);
                    }

                }
            }

        }

    }
}
/*
4
8 5
1 2
4 4
3 9
 */