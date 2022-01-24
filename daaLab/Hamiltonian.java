package daaLab;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Hamiltonian {
    public static int[] x;
    public static int n;
    public static int[][] G;
    public static void nextValue(int k)
    {
        int j;
        while(true)
        {
            x[k]=(x[k]+1)%(n+1);
            if(x[k]==0)
                return;
            if(G[x[k-1]][x[k]]!=0)
            {
                for(j=1;j<=k-1;j++)
                {
                    if(x[j]==x[k])
                        break;
                }
                if(j==k)
                {
                    if((k<n)||((k==n) && (G[x[n]][1]!=0)))
                        return;
                }
            }
        }
    }
    /*public static void nextValue(int k){
        do {
            x[k]=(x[k]+1)%(n+1);
            if(x[k]==0)
                return;
            if(G[x[k-1]][x[k]]!=0){
                int j=0;
                for(j=1;j<=k-1;j++){
                    if(x[j]==x[k])
                        break;
                }
                if(j==k){
                    if((k<n)||((k==n)&&G[x[n]][x[1]]!=0))
                        return;
                }
            }
        }while(true);
    }*/
    public static void hamiltonian(int k){
        do{
            nextValue(k);
            if(x[k]==0)
                return;
            if(k==n)
            {
                printSolution(k);
            }
            else
                hamiltonian(k+1);
        }while(true);
    }

    private static void printSolution(int k) {
        for(int i=1;i<=k;i++)
               System.out.print(x[i]+" ");
        System.out.println();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of vertices:");
        n=Integer.parseInt(br.readLine());
        G=new int[n+1][n+1];
        String[] sarr;
        System.out.println("Enter the Matrix row wise with 0's and 1's:");
        for(int i=1;i<=n;i++){
            sarr=br.readLine().split(" ");
            for(int j=1;j<=n;j++){
                G[i][j]=Integer.parseInt(sarr[j-1]);
            }
        }
        x=new int[n+1];
        System.out.println("The solutions are:");
        hamiltonian(2);
    }
}
/*
import java.util.*;
class Main
{
    static int[] x;
    static int[][] G;
    static int count=0,n;
    public static void NextValue(int k)
    {
        int j;
        while(true)
        {
            x[k]=(x[k]+1)%(n+1);
            if(x[k]==0)
              return;
            if(G[x[k-1]][x[k]]!=0)
            {
                for(j=1;j<=k-1;j++)
                {
                    if(x[j]==x[k])
                     break;
                }
                if(j==k)
                {
                    if((k<n)||((k==n) && (G[x[n]][1]!=0)))
                    return;
                }
            }
        }
    }
    public static void Hamiltonian(int k)
    {
        while(true)
        {
           NextValue(k);
           if(x[k]==0)
             return;
            if(k==n)
            {
                System.out.println("Solution:"+(++count));
                for(int i=1;i<=k;i++)
                {
                    System.out.print(x[i]+" ");
                }
                System.out.println();
            }
            else
             Hamiltonian(k+1);
        }
    }
    public static void main (String[] args)
    {

        Scanner s=new Scanner(System.in);
        int i,j;
        System.out.println("Enter the number of vertices:");
        n=s.nextInt();
        G=new int[n+1][n+1];
        x=new int[n+1];
        x[1]=1;
        System.out.println("Enter the edges cost in form of matrix:\n");
        for(i=1;i<=n;i++)
          for(j=1;j<=n;j++)
            G[i][j]=s.nextInt();
        Hamiltonian(2);
       System.out.println("Total cycles possible:"+count);
    }
}*/