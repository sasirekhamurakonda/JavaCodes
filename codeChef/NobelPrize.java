package codeChef;


import java.util.*;
        import java.lang.*;
        import java.io.*;
public class NobelPrize {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n,m;
        int[] res=new int[t];
        for(int i=0;i<t;i++){
            String[] sarr=br.readLine().split(" ");
            n=Integer.parseInt(sarr[0]);
            m=Integer.parseInt(sarr[1]);
            HashSet<Integer> hs=new HashSet<>();
            sarr=br.readLine().split(" ");
            for(int j=0;j<n;j++)
                hs.add(Integer.parseInt(sarr[j]));
            if(hs.size()<m)
                res[i]=1;
            else
                res[i]=0;
        }
        for(int i=0;i<t;i++){
            if(res[i]==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}