package Codeforces.vkcup;

import java.util.*;
import java.lang.*;
import java.io.*;
public class CharmedByGame {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int a,b;
        int[] res=new int[t];

        for(int i=0;i<t;i++){
            List<Integer> arrl=new ArrayList<>();
            String[] sarr=br.readLine().split(" ");
            a=Integer.parseInt(sarr[0]);
            b=Integer.parseInt(sarr[1]);
            for(int j=0;j<=(a+b);j++){
                int[] arr=new int[a+b];
                if(findIfPossible(a,b,j,arr,0)){
                    arrl.add(j);
                }
            }
            System.out.println(arrl.size());
            for(int j=0;j<arrl.size();j++){
                System.out.print(arrl.get(j)+" ");
            }
            System.out.println();
        }

    }

    private static boolean findIfPossible(int a, int b, int index,int[] arr,int curr) {

        if(index==0){
            int evenCount=0;
            int oddCount=0;
            for(int i=0;i<a+b;i++){
                if(i%2==0){
                    if(arr[i]==0)
                    evenCount++;
                    else
                        oddCount++;
                }
                else{
                    if(arr[i]==0)
                        oddCount++;
                    else
                        evenCount++;
                }
            }
            //System.out.println(curr+" "+evenCount+" "+oddCount);
            return (a == evenCount && b == oddCount) || (a == oddCount && b == evenCount);
        }
        if(curr==a+b)
            return false;
        arr[curr]=-1;
        if(findIfPossible(a,b,index-1,arr,curr+1))
            return true;
        arr[curr]=0;
        if(findIfPossible(a,b,index,arr,curr+1))
            return true;
        return false;
    }
}
/*
Example
inputCopy
3
2 1
1 1
0 5
outputCopy
4
0 1 2 3
2
0 2
2
2 3
 */
