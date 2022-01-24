package Codeforces.round748;

import java.util.*;
import java.lang.*;
import java.io.*;
public class MakeItDivisbleBy25{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            long n=Long.parseLong(br.readLine());
            int zeroes=0;
            int fives=0;
            int ones=0;
            int removed=0;
            while(n>0){
                long rem=n%10;
                if(rem==0){
                    if(zeroes>0){
                        if(fives>0){
                            removed++;
                        }
                        break;
                    }
                    zeroes++;
                }
                else if(rem==5){
                    if(zeroes>0){
                        if(fives>0)
                            removed++;
                        break;
                    }
                    if(fives==0)
                    fives++;
                    else
                        removed++;
                }
                else if(rem==2||rem==7){
                    if(fives>0){
                        if(zeroes>0)removed++;
                        break;
                    }
                    removed++;
                }
                else
                    removed++;
                n=n/10;
            }
            System.out.println(removed);

        }
    }
}
/*
Example
inputCopy
5
100
71345
3259
50555
2050047
outputCopy
0
3
1
3
2
 */