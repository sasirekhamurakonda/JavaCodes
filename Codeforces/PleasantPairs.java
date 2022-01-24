package Codeforces;

import javafx.util.Pair;
import java.util.*;
import java.lang.*;
import java.io.*;
public class PleasantPairs{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n+1];
            String[] sarr = br.readLine().split(" ");
            HashMap<Integer,Integer> hm=new HashMap<>();
            for (int j = 1; j <= n; j++) {
                arr[j] = Integer.parseInt(sarr[j - 1]);
                hm.put(arr[j],j);
            }
            int count=0;
            for(int j=2;j<=n;j++){
                for(int k=1;k*arr[j]<=2*n;k++){
                    if(hm.containsKey(k)) {
                        if ((hm.get(k) == arr[j] * k - j) && hm.get(k) < j) {
                            count++;
                        }
                    }
                }
            }
           /* LinkedHashMap<Integer,Integer> lhm=new LinkedHashMap<>();
            lhm.put(1,arr[1]);
            for(int j=2;j<=n;j++){
                for(int k=1;k<j;k++){
                    if(lhm.get(k)==)
                }
            }*/
            System.out.println(count);
        }
    }
}

/*
3
2
3 1
3
6 1 5
5
3 1 5 9 2
 */