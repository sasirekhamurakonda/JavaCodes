package Quora;

import java.util.*;
import java.lang.*;
import java.io.*;
public class flipped {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String[] sarr=br.readLine().split(" ");
        int n=Integer.parseInt(sarr[0]);
        int f=Integer.parseInt(sarr[1]);
        int b=Integer.parseInt(sarr[2]);
        double[][] data=new double[n][f];
        double sum=0;
        for(int i=0;i<n;i++){
            sarr=br.readLine().split(" ");
            for(int j=0;j<f;j++){
                data[i][j]=Integer.parseInt(sarr[j]);
            }
        }
        for(int i=0;i<f;i++){
            for(int j=0;j<n;j++){

            }
        }

    }
}