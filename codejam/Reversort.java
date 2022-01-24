package codejam;

import java.util.*;
        import java.lang.*;
        import java.io.*;
public class Reversort  {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        int n;
        int[] arr;
        int count=0;
        for(int i=0;i<t;i++) {
            n=Integer.parseInt(br.readLine());
            String[] sarr = br.readLine().split(" ");
            arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=Integer.parseInt(sarr[j]);
            }
            int min=0,mini=0;
            count=0;
            for(int j=0;j<n-1;j++){
                min=arr[j];
                mini=j;
                int k=0;
                for(k=j+1;k<n;k++){
                    if(min>arr[k]){
                        mini=k;
                        min=arr[k];
                        System.out.println(mini+" "+min);
                    }
                }
                if(mini!=j){
                    for(int l=j,p=0;l<=(mini+j)/2;l++,p++){
                        int temp=arr[l];
                        arr[l]=arr[mini-p];
                        arr[mini-p]=temp;
                    }

                }
                count+=(mini-j+1);
                for(int z=0;z<n;z++){
                    System.out.print(arr[z]+" ");
                }
                System.out.println("count="+count);

            }
            System.out.println("Case #"+(i+1)+": "+count);
        }

    }
}