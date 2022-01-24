package Codeforces.EducationRound;


import java.util.*;
import java.lang.*;
import java.io.*;
public class FindMinSizeS {
    public static int findMinLength(int s,int sum,ArrayList<Integer> arr){
        //System.out.println(s+" "+sum);
        if(sum==s){
//            for(int i=0;i<arr.size();i++){
//                System.out.print(arr.get(i)+" ");
//            }
//            System.out.println();
            return arr.size();
        }
        if(sum>s)return 10000000;
        int n=arr.size();
        int x=arr.get(n-1);
        sum=sum+(x+1);
        arr.add(x+1);
        int size1=findMinLength(s,sum,arr);
        arr.set(n,x+2);
        sum=sum+1;
        int size2=findMinLength(s,sum,arr);
        arr.remove(n);
        sum=sum-(x+2);
        return Math.min(size1,size2);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++){
            int s=Integer.parseInt(br.readLine());
//            ArrayList<Integer> arr=new ArrayList<>();
//            arr.add(1);
//            System.out.println(findMinLength(s,1,arr));
            int sum=1;
            int count=1;
            int prev=1;
            while(sum<s){
                System.out.println(sum+" "+count);
                count++;



               if(sum+(prev+2)<=s){
                   sum=sum+2+prev;
                   prev=prev+2;
               }
               else if(sum+(prev+1)<=s){
                   sum=sum+1+prev;
                   prev=prev+1;
               }
               else{
                   sum=sum+1;
               }
            }
            System.out.println(count);
        }

    }
}
/*
4
1
8
7
42


1
3
3
7
 */