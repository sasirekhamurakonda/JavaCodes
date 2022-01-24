package Codeforces;

import java.util.*;
import java.lang.*;
import java.io.*;

class CodeForcesRound273
{
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void findChess()throws java.lang.Exception{
        int n=Integer.parseInt(br.readLine());
        int[] arr=new int[n];
        String[] sarr=br.readLine().split(" ");
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(sarr[i]);
        }
        long res=1;
        if(n==2){
            res=(long)arr[0]*arr[1];
            System.out.println(res);
        }
        else{
            res=(long)arr[0]*arr[1];
            int min=0,max=0,mini=0,maxi=0;
            if(arr[0]<=arr[1]){
                min=arr[0];
                max=arr[1];
                maxi=1;
            }
            else{
                min=arr[1];
                mini=1;
                max=arr[0];
            }
            for(int i=2;i<n;i++){
                if(mini<maxi){
                    if(arr[i]>max){
                        mini=maxi;
                        min=max;
                        maxi=i;
                        max=arr[i];
                    }
                    else if(arr[i]==max){
                        maxi=i;
                    }
                    else if((arr[i]>min&&arr[i]<max)||(arr[i]<min)){
                        mini=i;
                        min=arr[i];
                    }
                }
                else{
                    if(arr[i]==min){
                        mini=i;
                    }
                    else if(arr[i]==max){
                        maxi=i;
                    }
                    else if((arr[i]>max)||(arr[i]>min&&arr[i]<max)){
                        maxi=i;
                        max=arr[i];
                    }
                    else{
                        maxi=mini;
                        max=min;
                        min=arr[i];
                        mini=i;
                    }
                }
                if((long)min*max>res){
                    res=(long)max*min;
                }
            }
            System.out.println(res);
        }

    }
    public static void main (String[] args) throws java.lang.Exception
    {
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {

            findChess();
        }
    }
}
/*

4
3
2 4 3
4
3 2 3 1
2
69 69
6
719313 273225 402638 473783 804745 323328

381274500335



res=(long)arr[0]*arr[1];
            int min=0,max=0,mini=0,maxi=0;
            if(arr[0]<=arr[1]){
                min=arr[0];
                max=arr[1];
                maxi=1;
            }
            else{
                min=arr[1];
                mini=1;
                max=arr[0];
            }
            for(int i=2;i<n;i++){
                if(mini<maxi){
                    if(arr[i]>max){
                        mini=maxi;
                        min=max;
                        maxi=i;
                        max=arr[i];
                    }
                    else if(arr[i]==max){
                        maxi=i;
                    }
                    else if((arr[i]>min&&arr[i]<max)||(arr[i]<min)){
                        mini=i;
                        min=arr[i];
                    }
                }
                else{
                    if(arr[i]==min){
                        mini=i;
                    }
                    else if(arr[i]==max){
                        maxi=i;
                    }
                    else if((arr[i]>max)||(arr[i]>min&&arr[i]<max)){
                        maxi=i;
                        max=arr[i];
                    }
                    else{
                        maxi=mini;
                        max=min;
                        min=arr[i];
                        mini=i;
                    }
                }
                if((long)min*max>res){
                    res=(long)max*min;
                }
            }
 */