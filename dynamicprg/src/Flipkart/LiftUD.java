package Flipkart;


import java.util.*;
import java.lang.*;
import java.io.*;
public class LiftUD {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String lift=br.readLine();
        int n=lift.length();
        int sum=0;
        for(int i=0;i<n;i++){
            if(lift.charAt(i)=='D'){
                sum=sum+(i);
                if(i<n-1) {
                    for (int j = 0; j < i; j++) {
                        if (lift.charAt(j) == 'U') {
                            sum += 2;
                        }
                    }
                }
            }
            else{
                sum+=(n-i-1);
                int temp=0;
                if(i>0) {
                    for (int j = i + 1; j < n; j++) {
                        if (lift.charAt(j) == 'D')
                            sum +=2;
                    }
                }
            }
            System.out.println("sum="+sum);
        }
        System.out.println(sum);
    }
}