package Flipkart;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Question1 {
    /*public static boolean isPossible(int[] x,int X,int[] y,int Y){
        for(int i=0;i<x.length;i++){
            for(int j=0;j<y.length;j++){
                if(X-x[i]+y[j]==Y-y[j]+x[i]) {
                    System.out.println(x[i]+" "+y[j]);
                    return true;
                }
            }
        }
        return false;
    }
    public static int findNumPossible(int[] arr,int n){
        ArrayList<ArrayList<Integer>> arrl=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++){
            int x=arr[i];
            int y=arr[i+1];
            for(int j=i+2;j<n;j++){
                if(y-x<=arr[j]-y&&arr[j]-y<=2*(y-x)){
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(x);
                    temp.add(y);
                    temp.add(arr[j]);
                    if(!arrl.contains(temp))arrl.add(temp);
                }
            }
        }
    }
    public static int maxProfit(int[] arr,int n){
        int[] aux=new int[n];
        aux[0]=arr[0];
        aux[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++)
            aux[i]=Math.max(aux[i-1],aux[i-2]+arr[i]);
        return aux[n-1];
    }
    public static void main(String[] args) throws IOException {
        int[] x={2,9,14};
        int[] y={3,7,11};
        System.out.println(isPossible(x,25,y,21));
    }*/
}
