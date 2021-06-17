package codeChef;


import java.util.*;
import java.lang.*;
import java.io.*;
public class NoOfGroupsPossible {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            if(n==2)
                System.out.println("1");
            else {
                int[] arr = new int[n + 1];
                int[] parent = new int[n + 1];
                int[] rank = new int[n + 1];

                for (int j = 2; j <= n; j++) {
                    if(j==2){
                        arr[j]=2;
                        parent[j]=2;
                        rank[j]=0;
                    }
                    else if (j % 2 == 0) {
                        arr[j] = j;
                        parent[j] = 2;
                        rank[j] = 0;
                        rank[2]++;
                    } else {
                        arr[j] = j;
                        parent[j] = j;
                        rank[j] = 0;
                    }
                }
                for (int j = 3; j <= n; j++) {
                    if(parent[j]==j) {
                        for (int k = j + 1; k <= n; k++) {
                            if (gcd(j, k)) {
                                union(parent,rank,j,k);
                                break;
                            }
                        }
                    }
                }

                Arrays.sort(parent);
                int count=0;
                for(int j=2;j<=n;j++){
                    if(j==2){
                        count++;
                    }
                    else if(parent[j]!=parent[j-1])
                        count++;
                }
                System.out.println(count);
            }

        }
    }

    private static void union(int[] parent, int[] rank, int j, int k) {
        int a=get(parent,j);
        int b=get(parent,k);
        if(rank[a]==rank[b]){
            rank[a]++;
            parent[b]=a;
        }
        if(rank[a]>rank[b]){
            parent[b]=a;
        }
        else{
            parent[a]=b;

        }

    }

    private static int get(int[] parent, int a) {
        return parent[a]=(parent[a]==a?a:get(parent,parent[a]));
    }

    private static boolean gcd(int n1, int n2) {
        while(n1!=n2)
        {
            if(n1>n2)
                n1=n1-n2;
            else
                n2=n2-n1;
        }
        return n2 != 1;
    }
}