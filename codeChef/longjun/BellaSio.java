package codeChef.longjun;


import java.util.*;
        import java.lang.*;
        import java.io.*;
public class BellaSio{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int D,d,p,q;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            D=Integer.parseInt(sarr[0]);
            d=Integer.parseInt(sarr[1]);
            p=Integer.parseInt(sarr[2]);
            q=Integer.parseInt(sarr[3]);
            long sum=0;
            sum+=((long) p *D);
            //System.out.println(sum);
            int divisor=D/d;
            int x=divisor-1;
            sum=sum+(((long) x*(x+1)/2)*d*q);
            //System.out.println(sum);
            if(D%d!=0){
                int remainder=D%d;
                sum+=((long) divisor *remainder*q);
            }
            System.out.println(sum);

        }
    }
}
/*
3
2 1 1 1
3 2 1 1
5 2 1 2
Sample Output
3
4
13

4 2 1 2
x=1


1 1 1 1
0 0 2 2

1 1 1 1 1
0 0 2 2 4
    d*q 1+

11 2 1 1
1 1 2 2 3 3 4 4 5 5 6
10*1=10
2(1+2+3+4)=20
30


while(D>d){//10 2 1 1-->1 1 2 2 3 3
                sum=sum+((long)p*d);
                D=D-d;
                p=p+q;
            }
            sum=sum+((long)D*p);
            System.out.println(sum);
 */