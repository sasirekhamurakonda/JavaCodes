package Flipkart;
import java.util.*;
import java.lang.*;
import java.io.*;


public class Matrixzeroes {
    public static void setRowColumnZeroes(int[][] matrix){
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] temp=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                temp[i][j]=matrix[i][j];
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(matrix[i][j]==0&&temp[i][j]==0){
                    for(int l=0;l<c;l++){
                        matrix[i][l]=0;
                    }
                    for(int l=0;l<r;l++){
                        matrix[l][j]=0;
                    }
                }
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++){
            int r,c;
            String[] sarr=br.readLine().split(" ");
            r=Integer.parseInt(sarr[0]);
            c=Integer.parseInt(sarr[1]);
            int[][] arr=new int[r][c];
            for(int i=0;i<r;i++){
                sarr=br.readLine().split(" ");
                for(int j=0;j<c;j++){
                    arr[i][j]=Integer.parseInt(sarr[j]);
                }
            }
            setRowColumnZeroes(arr);
        }
    }
}
