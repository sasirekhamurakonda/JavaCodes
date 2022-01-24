package Codeforces.round731;

import java.util.*;
import java.lang.*;
import java.io.*;
public class FindShortDistance {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            String s = br.readLine();
            String[] sarr = br.readLine().split(" ");
            int a1=Integer.parseInt(sarr[0]);
            int a2=Integer.parseInt(sarr[1]);
            sarr = br.readLine().split(" ");
            int b1=Integer.parseInt(sarr[0]);
            int b2=Integer.parseInt(sarr[1]);
            sarr = br.readLine().split(" ");
            int f1=Integer.parseInt(sarr[0]);
            int f2=Integer.parseInt(sarr[1]);
            int dist=Math.abs(b1-a1)+Math.abs(b2-a2);
            if(a1==b1||a2==b2){

                int part=Math.abs(f1-a1)+Math.abs(f2-a2)+Math.abs(f1-b1)+Math.abs(f2-b2);
                if(dist==part){
                    System.out.println(dist+2);
                }
                else{
                    System.out.println(dist);
                }
            }
            else{
                System.out.println(dist);
            }

        }
    }
}
/*
7

1 1
3 3
2 2

2 5
2 1
2 3

1000 42
1000 1
1000 1000

1 10
3 10
2 10

3 8
7 8
3 7

2 1
4 1
1 1

1 344
1 10
1 1


outupt
4
6
41
4
4
2
334
 */