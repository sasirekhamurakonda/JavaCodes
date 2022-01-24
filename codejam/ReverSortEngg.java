package codejam;

import java.util.*;
import java.lang.*;
import java.io.*;
public class ReverSortEngg {
    public static int findMax(int x){
        int max=(x/2)+1;
        return ((max*(max+1))/2)+(max-1);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n,c;
        int max=0,min=0;
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            c=Integer.parseInt(sarr[1]);
            max=0;
            min=0;
            if(n==2){
                if(c==1){
                    System.out.println("Case #"+(i+1)+": 1 2");
                }
                else if(c==2){
                    System.out.println("Case #"+(i+1)+": 2 1");
                }
                else{
                    System.out.println("Case #"+(i+1)+": IMPOSSIBLE");
                }
            }
            else {
                min=n-1;
                max=(n*(n+1))/2;
                //System.out.println("min="+min+"max="+max);
                if (min <= c && max >= c) {
                    System.out.print("Case #" + (i+1) + ": ");
                    if (c == min) {
                        for(int j=1;j<=n;j++){
                            System.out.print(j+" ");
                        }
                        System.out.println();
                    }
                    else if(c==min+(n-1)){
                        for(int j=n;j>=1;j--){
                            System.out.print(j+" ");
                        }
                        System.out.println();
                    }
                    else if(c<(min+(n-1))){
                        int k=c-min;
                        for(int j=k+1;j>=1;j--){
                            System.out.print(j+" ");
                        }
                        for(int j=k+2;j<=n;j++){
                            System.out.print(j+" ");
                        }
                        System.out.println();
                    }
                    else{
                        int temp=(min+(n-1));
                        int x=c-(temp)+1;
                        int[] arr=new int[n];
                        for(int j=0;j<n;j++)
                            arr[j]=j+1;
                        for(int j=0;j<(n-2);j++){
                            int z=2+j;
                            for(int k=n-1;k<(n-k)/2;k--){
                                int tempz=arr[k];
                                arr[k]=arr[k-1];

                            }
                        }
                    }
                } else {
                    System.out.println("Case #" + (i+1) + ": IMPOSSIBLE");
                }
            }
        }
    }
}
/*
5
4 6
2 1
7 12
7 2
2 1000
 */