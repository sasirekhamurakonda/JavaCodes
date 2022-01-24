package codeChef;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class DishOwner{
    public static void union(int[] parent,int a,int b,int[] dishes){
        int pa=get(parent,a);
        int pb=get(parent,b);
        if(dishes[pa]>dishes[pb]){
            parent[pb]=pa;
        }
        else if(dishes[pa]<dishes[pb]){
            parent[pa]=pb;
        }
    }

    private static int get(int[] parent, int a) {
        return parent[a]=(parent[a]==a?a:get(parent,parent[a]));
    }

    public static void main(String[] args) throws java.lang.Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int n = Integer.parseInt(br.readLine());
            int[] dishes = new int[n+1];
            String[] sarr = br.readLine().split(" ");
            for (int j = 1; j <= n; j++)
                dishes[j] = Integer.parseInt(sarr[j-1]);

            int[] parent=new int[n+1];
            for(int j=0;j<=n;j++){
                parent[j]=j;
            }

            int q = Integer.parseInt(br.readLine());
            for(int j=0;j<q;j++){
                sarr=br.readLine().split(" ");
                int a=Integer.parseInt(sarr[0]);
                if(a==1){
                    int index=Integer.parseInt(sarr[1]);
                    System.out.println(get(parent,index));
                }
                else{
                    int p1=Integer.parseInt(sarr[1]);
                    int p2=Integer.parseInt(sarr[2]);
                    int par1=get(parent,p1);
                    int par2=get(parent,p2);
                    if(par1==par2){
                        System.out.println("Invalid query!");
                    }
                    else{
                        if(dishes[par1]>dishes[par2]){
                            parent[par2]=par1;
                        }
                        else if(dishes[par1]<dishes[par2]){
                            parent[par1]=par2;
                        }
                    }
                }
            }


        }
    }
}
/*
Input:
1
2
1 2
2
0 1 2
1 1
Output:
2
 */