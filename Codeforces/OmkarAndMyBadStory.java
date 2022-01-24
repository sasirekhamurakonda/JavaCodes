package Codeforces;

import java.util.*;
import java.lang.*;
import java.io.*;
public class OmkarAndMyBadStory{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        //System.out.println(0/4);
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            ArrayList<Integer> arrl=new ArrayList<>();
            String[] sarr = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
                arrl.add(Integer.parseInt(sarr[j]));
            Collections.sort(arrl);
            if(arrl.get(0)<0&&arrl.get(n-1)>0)
                System.out.println("NO");
            else{
                int mindiff=Integer.MAX_VALUE;
                for(int j=0;j<n-1;j++){
                    if(mindiff>arrl.get(j+1)-arrl.get(j)){
                        mindiff=arrl.get(j+1)-arrl.get(j);
                    }
                }
                if(arrl.contains(mindiff)){
                    System.out.println("YES");
                    System.out.println(n);
                    for(int j=0;j<n;j++)
                        System.out.print(arrl.get(j)+" ");
                    System.out.println();
                }
                else{
                    int large=arrl.get(n-1);
                    int[] arr=new int[large+1];
                    for(int j=0;j<n;j++){
                        arr[Math.abs(arrl.get(j))]=1;
                    }
                    int count=n;
                    arr[mindiff]=1;
                    for(int j=2*mindiff;j<=large;j+=mindiff){
                        if(arr[j]!=1) {
                            arr[j] = 1;
                            count++;
                        }
                    }
                    System.out.println(count);
                    if(arrl.get(0)>=0){
                        for(int j=0;j<=large;j++){
                            if(arr[j]==1)
                                System.out.print(j+" ");
                        }
                        System.out.println();
                    }
                    else{
                        for(int j=0;j<=large;j++){
                            if(arr[j]==1)
                                System.out.print((-1*j)+" ");
                        }
                        System.out.println();
                    }
                }

            }
        }
    }
}
/*
4
3
3 0 9
2
3 4
5
-7 3 13 -2 8
4
4 8 12 6



yes
4
6 0 3 9
yEs
5
5 3 1 2 4
NO
Yes
6
8 12 6 2 4 10
 */