package daaLab;
import java.util.*;
import java.lang.*;
import java.io.*;
public class VertexCover {
    public static int n;
    public static int[] vertex;
    public static int[][] matrix;
    public static void vertexCover(){
        boolean visited[]=new boolean[n];
        for(int i=0;i<n;i++)
            visited[i]=false;
        for(int i=0;i<n;i++){
            if(visited[i]==false){
                for(int j=0;j<n;j++){
                    if(matrix[i][j]==1) {
                        if (visited[j] == false) {
                            visited[j] = true;
                            visited[i] = true;
                            break;
                        }
                    }
                }
            }
        }
        System.out.println("The vertex cover is:");
        for(int j=0;j<n;j++){
            if(visited[j])
                System.out.print((j+1)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number of vertices:");
        n=Integer.parseInt(br.readLine());
        vertex=new int[n];
        matrix=new int[n][n];
        String[] sarr;
        System.out.println("Enter the edges(0 1 0 1 1 0) in matrix format:");
        for(int i=0;i<n;i++){
            sarr=br.readLine().split(" ");
            for(int j=0;j<n;j++){
                matrix[i][j]=Integer.parseInt(sarr[j]);
            }
        }
        vertexCover();
    }
}


/*
* 0 1 0 0 0 0 0
1 0 1 0 0 0 0
0 1 0 1 1 0 0
0 0 1 0 0 1 1
0 0 1 0 0 1 0
0 0 0 1 1 0 0
0 0 0 1 0 0 0
*/