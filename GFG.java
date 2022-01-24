


import java.util.*;
import java.lang.*;
import java.io.*;
public class GFG {
}
class Solution{
    int get(int[] parent,int a){
        return parent[a]=(parent[a]==a?a:get(parent,parent[a]));
    }
    void union(int[] parent,int[] rank,int a,int b){
        a=get(parent,a);
        b=get(parent,b);
        if(rank[a]==rank[b]){
            if(a<b)
                rank[a]++;
            else
                rank[b]++;
        }
        if(rank[a]>rank[b]){
            parent[b]=a;
        }
        else{
            parent[a]=b;
        }
    }
    long minEnergy(int N, int P, int ener[], int friends[][]){
        int[] parent=new int[N+1];
        int[] rank=new int[N+1];
        for(int i=1;i<=N;i++){
            parent[i]=i;
        }
        long sol=0;
        for (int[] friend : friends) {
            union(parent, rank, friend[0], friend[1]);
        }
        Set<Integer> hs=new HashSet<Integer>();
        for(int i=1;i<=N;i++){
            if(!hs.contains(i)){
                int min=ener[i-1];
                hs.add(i);
                for(int j=i+1;j<=N;j++){
                    if(!hs.contains(j)&&get(parent,j)==i){
                        if(ener[j-1]<min){
                            min=ener[j-1];
                        }
                        hs.add(j);
                    }
                }
                sol+=min;
            }
        }
        return sol;

    }
}