package codeChef;
import java.util.*;
import java.lang.*;
import java.io.*;
public class FlipkartAscDes {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int[] num;
        String[] city;
        String[] temp;
        int n=Integer.parseInt(br.readLine());
        city=new String[n];
        num=new int[n];
        int[] pos=new int[n];
        for(int j=0;j<n;j++) {
            temp = br.readLine().split(" ");
            city[j]=temp[0];
            num[j]=Integer.parseInt(temp[1]);
            pos[j]=j;
        }
        String mins="";
        int mini=0;
        for(int j=0;j<n;j++) {
            mins = city[j];
            mini = j;
            for (int k = j+1; k < n; k++) {
                if (mins.compareTo(city[k]) == 0) {
                    if (num[mini] < num[k]) {
                        mins = city[k];
                        mini = k;
                    }
                } else if (mins.compareTo(city[k]) > 0) {
                    mins = city[k];
                    mini = k;
                }
            }
            if (mini !=j){
                int x=num[mini];
                city[mini]=city[j];
                num[mini]=num[j];
                city[j]=mins;
                num[j]=x;
                int xy=pos[j];
                pos[j]=pos[mini];
                pos[mini]=xy;
            }
        }
        for(int i=0;i<n;i++)
            System.out.println((pos[i]+1));
    }
}